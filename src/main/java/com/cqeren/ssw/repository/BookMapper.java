/**
 * 
 */
package com.cqeren.ssw.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cqeren.ssw.domain.Book;

/**
 * @author Administrator
 *
 */
@Mapper
public interface BookMapper {
	
	Book findByTitle(@Param("title") String title);

}
