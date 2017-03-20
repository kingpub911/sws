/**
 * 
 */
package com.cqeren.ssw.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cqeren.ssw.domain.Book;

/**
 * @author Administrator
 *
 */
@Mapper
public interface BookMapper {

	public Book findByTitle(@Param("title") String title);

	public Book findBookById(@Param("id") long id);

	public List<Book> selectBooks();

	public Iterable<Book> selectBooks1();

	public void insertBook(@Param("Book") Book book);

}
