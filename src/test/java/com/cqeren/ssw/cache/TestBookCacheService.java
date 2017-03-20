/**
 * 
 */
package com.cqeren.ssw.cache;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cqeren.ssw.SwsApplication;
import com.cqeren.ssw.domain.Book;
import com.cqeren.ssw.service.BookService;

/**
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SwsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestBookCacheService {
	private static final Logger log = LoggerFactory.getLogger(TestBookCacheService.class);
	@Autowired
	private BookService  bookService ;
	@Autowired
	private RedisService redisService;
	
//	@Test
	public void insert(){
		Book book = new Book();
		book.setBorrowDate(new Date());
		book.setBorrowerId(new Long(1111111));
		book.setDescription("asdaassfdasdfa");
		book.setDoubanId("111111113223");
		book.setOnboardDate(new Date());
		book.setOwnerId(new Long(4444));
		book.setStatus("idle");
		book.setTitle("说的都是上帝的是速度发射点发射点");
		book.setUrl("http://book.douban.com/subject/44444444444/");
		book.setId(new Long(4));
		bookService.insertBook(book);
		log.info("sddsdsdsd=" + book.getTitle());
	}
	@Test
	public void getBookMyId(){//手动执行redis缓存
		Book book = bookService.findByTilte("DSL实战");
		log.info("sddsdsdsd=" + book.getTitle());
		redisService.flushDB();
		log.info("id="  + book.getId());
		redisService.setForValue(book.getDoubanId(), book.getUrl());
	}
}
