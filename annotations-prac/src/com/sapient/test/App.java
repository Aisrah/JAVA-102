package com.sapient.test;

import com.sapient.container.Container;
import com.sapient.container.annotations.HTTPMethod.*;

public class App {

	public static void main(String[] args) throws Exception {
		
		Container container = new Container();
		container.process("/login", HTTPMethod.GET);
	}
}
