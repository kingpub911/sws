/**
 * 
 */
package com.cqeren.ssw.cache.impl;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.cqeren.ssw.cache.RedisService;

/**
 * @author Administrator
 * 手动缓存数据的执行类
 */
@Service
public class RedisServiceImpl implements RedisService {
	@Autowired
	private RedisTemplate<?, ?> redisTemplate;
	@Autowired
	private StringRedisTemplate stringTemplate;

	/** 获得客户端列表 */
	public List<?> getClients() {
		return redisTemplate.getClientList();
	}

	/** 设置有超时时间的KV */
	public Long set(String key, String value, long seconds) {
		return redisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection c) throws DataAccessException {
				c.set(key.getBytes(), value.getBytes());
				c.expire(key.getBytes(), seconds);
				return 1L;
			}
		});
	}

	/**
	 * 存入不会超时的KV
	 */
	public Long set(String key, String value) {
		return redisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection c) throws DataAccessException {
				c.set(key.getBytes(), value.getBytes());
				return 1L;
			}
		});
		// return redisTemplate.execute(c -> {
		// c.set(key.getBytes(), value.getBytes());
		// return 1L;
		// });
	}

	/**
	 * redis数据库条数
	 */
	public Long dbSize() {
		return redisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection c) throws DataAccessException {
				return c.dbSize();
			}
		});
		// return redisTemplate.execute(c -> c.dbSize());
	}

	public String ping() {
		return redisTemplate.execute(new RedisCallback<String>() {

			@Override
			public String doInRedis(RedisConnection c) throws DataAccessException {
				return c.ping();
			}
		});
		// return redisTemplate.execute(c -> c.ping());
	}

	/**
	 * 删除所有指定数据库的数据
	 */
	public Long flushDB() {
		return redisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection c) throws DataAccessException {
				c.flushDb();
				return 1L;
			}
		});
	}

	/** 判断redis数据库是否有对应的key */
	public boolean exist(String key) {
		return (boolean) redisTemplate.execute((RedisCallback<Object>) c -> c.exists(key.getBytes()));
	}

	/** 获得redis数据库所有的key */
	public Set<String> keys(String pattern) {
		return redisTemplate.execute((RedisCallback<Set<String>>) c -> c.keys(pattern.getBytes()).stream()
				.map(this::getUTF).collect(Collectors.toSet()));
	}

	public String getUTF(byte[] data) {
		try {
			return new String(data, "utf-8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

	@Override
	public void setBytes(final String key, final byte[] bs) {
		redisTemplate.execute(new RedisCallback<Object>() {

			@Override
			public Object doInRedis(RedisConnection c) throws DataAccessException {
				c.set(key.getBytes(), bs);
				return null;
			}

		});
	}

	@Override
	public byte[] getBytes(final String key) {
		byte[] exportBytes = redisTemplate.execute(new RedisCallback<byte[]>() {

			@Override
			public byte[] doInRedis(RedisConnection c) throws DataAccessException {
				byte[] bs = c.get(key.getBytes());
				return bs;
			}
		});
		return exportBytes;
	}

	@Override
	public void setForValue(String key, String value) {
		stringTemplate.opsForValue().set(key, value);
	}

	@Override
	public String getForValue(String key) {
		return stringTemplate.opsForValue().get(key);
	}

	@Override
	public void setForHash(String key, String hashKey, Object value) {
		stringTemplate.opsForHash().put(key, hashKey, value);
	}

	@Override
	public Object getForHash(String key, String hashKey) {
		return stringTemplate.opsForHash().get(key, hashKey);
	}

}
