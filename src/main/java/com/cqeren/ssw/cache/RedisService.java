/**
 * 
 */
package com.cqeren.ssw.cache;

import java.util.List;
import java.util.Set;

/**
 * @author Administrator
 *
 */
public interface RedisService {

	public List<?> getClients();

	public Long set(String key, String value, long seconds);

	public Long set(String key, String value);

	public Long dbSize();

	public String ping();

	public Long flushDB();

	public boolean exist(String key);

	public Set<String> keys(String pattern);

	public String getUTF(byte[] data);

	public void setBytes(String key, byte[] bs);

	public byte[] getBytes(String key);

	public void setForValue(String key, String value);

	public String getForValue(String key);

	public void setForHash(String key, String hashKey, Object value);

	public Object getForHash(String key, String hashKey);

}
