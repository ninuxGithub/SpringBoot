package com.hundsun.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author shenzm
 *	已处理
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public void defaultErrHandler(HttpServletRequest request, Exception e) {
		System.err.println("test Gloable Error");
	}

}
