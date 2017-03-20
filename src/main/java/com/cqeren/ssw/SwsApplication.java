package com.cqeren.ssw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.cqeren.ssw.repository")
@EnableCaching
public class SwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwsApplication.class, args);
	}
}
