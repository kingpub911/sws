/**
 * 
 */
package com.cqeren.ssw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@RestController
public class HelloWorldController {
	
	 @RequestMapping("/")
     public String sayHelloWord(){
    	 return "Hello,World!";
     }
}
