/**
 * 
 */
package com.cqeren.ssw.service;

import com.cqeren.ssw.domain.Book;

/**
 * @author Administrator
 *
 */
public interface BookService {
	
	Book findByTilte(String title);

}
