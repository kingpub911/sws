/**
 * 
 */
package com.cqeren.ssw.service;

import java.util.List;

import com.cqeren.ssw.domain.Book;

/**
 * @author Administrator
 *
 */
public interface BookService {
	
	public Book findByTilte(String title);
	public Book findBookById(long id);
	public List<Book> selectBooks();
	public void insertBook(Book book);
	
	//cache

}
