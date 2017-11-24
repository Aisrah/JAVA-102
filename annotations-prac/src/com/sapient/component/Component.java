package com.sapient.component;

import com.sapient.container.annotations.URLMapping.*;
import com.sapient.container.annotations.HTTPMethod.*;;

public class Component {

	@URLMapping()
	void doSomething()
	{
		System.out.println("Do something.....");
	}
	
	@URLMapping(url = "/login", method = HTTPMethod.GET)
	void login()
	{
		System.out.println("Login....");
	}
	
	@URLMapping(url = "/register", method = HTTPMethod.POST)
	void register()
	{
		System.out.println("Register....");
	}
}
