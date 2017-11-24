package com.sapient.container.annotations.URLMapping;


import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.sapient.container.annotations.HTTPMethod.HTTPMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD, ElementType.TYPE})
public @interface URLMapping {

	String url() default "/";
	HTTPMethod method() default HTTPMethod.GET;
}
