package com.cqeren.ssw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cqeren.ssw.repository")
public class SwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwsApplication.class, args);
	}
}
