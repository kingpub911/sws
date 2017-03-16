/**
 * 
 */
package com.cqeren.ssw;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cqeren.ssw.controller.HelloWorldController;

/**
 * @author Administrator
 *
 */
public class HelloWorldControllerTest {
	
	 @Test
     public void testSayHello(){
		 assertEquals("Hello,World!", new HelloWorldController().sayHelloWord());
    	 
     }
}
