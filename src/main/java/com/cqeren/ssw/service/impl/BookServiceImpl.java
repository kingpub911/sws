/**
 * 
 */
package com.cqeren.ssw.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqeren.ssw.domain.Book;
import com.cqeren.ssw.repository.BookMapper;
import com.cqeren.ssw.service.BookService;

/**
 * @author Administrator
 *
 */
@Service
public class BookServiceImpl implements BookService{
	private static final Logger log = LoggerFactory.getLogger(BookServiceImpl.class);
	
	@Autowired
	private BookMapper bookMapper;
	
	public Book findByTilte(String title) {
		return bookMapper.findByTitle(title);
	}
	
	public List<Book> selectBooks() {
		return bookMapper.selectBooks();
	}
	
    @Override
//    @CachePut(value="book", key="#book.id")//自动执行缓存
    public void insertBook(Book book) {
    	bookMapper.insertBook(book);
    	log.info("保存缓存book。id" + book.getId());
    	
    }
	
    @Override
//    @Cacheable(value="book", key="#book.id")//自动
    public Book findBookById(long id) {
    	log.info("获取缓存book。id" + id);
    	return bookMapper.findBookById(id);
    }
}
