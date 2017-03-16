/**
 * 
 */
package com.cqeren.ssw.service.impl;

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
	
	@Autowired
	private BookMapper bookMapper;
	
	public Book findByTilte(String title) {
		return bookMapper.findByTitle(title);
	}

}
