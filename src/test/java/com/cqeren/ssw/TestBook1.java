/**
 * 
 */
package com.cqeren.ssw;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cqeren.ssw.domain.Book;
import com.cqeren.ssw.service.BookService;

/**
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SwsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestBook1 {
	private static final Logger log = LoggerFactory.getLogger(TestBook1.class);

	@Autowired
	private BookService bookService;

	@Test
	public void getTitle() {
		Book book = bookService.findByTilte("DSL实战");
		log.info("book 对象="+ book.getDoubanId() + "=====" +book.getTitle() + "-----" + book.getOnboardDate());

	}
//	@Test
	public void findBooks(){
		List<Book> list = bookService.selectBooks();
		for (Book book : list) {
			log.info(book.getTitle());
		}
	}
}
