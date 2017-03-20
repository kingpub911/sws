/**
 * 
 */
package com.cqeren.ssw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cqeren.ssw.domain.Book;
import com.cqeren.ssw.service.BookService;

/**
 * @author Administrator
 *
 */
@RestController
public class BookRestController {
	
	@Autowired
    private BookService bookService;
	
	@RequestMapping(value = "/api/book", method = RequestMethod.GET)
	public Book findBookByTitle(@RequestParam(value="title",required = true) String title){
		return bookService.findByTilte(title);
	}
	@RequestMapping(value = "/api/booklist", method = RequestMethod.GET)
	public List<Book> findALLBooks(){
		return bookService.selectBooks();
	}
}
