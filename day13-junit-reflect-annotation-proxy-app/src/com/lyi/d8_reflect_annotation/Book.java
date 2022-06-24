package com.lyi.d8_reflect_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义注解 Book
 * @author 95848
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface  Book{
	public   String value();
	public double price() default 100.0;
	public String[] authors() ;
}
