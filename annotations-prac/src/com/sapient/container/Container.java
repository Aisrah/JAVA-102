package com.sapient.container;

import java.lang.reflect.Method;

import com.sapient.container.annotations.HTTPMethod.HTTPMethod;
import com.sapient.container.annotations.URLMapping.URLMapping;

public class Container {
	public void process(String url, HTTPMethod httpMethod) throws Exception{
		
		Class<?> compClazz = Class.forName("com.sapient.component.Component");
		Object instance = compClazz.newInstance();
		
		Method[] methods = compClazz.getMethods();
		for(Method method : methods)
		{
			URLMapping urlMapping = method.getAnnotation(URLMapping.class);
			if(urlMapping != null)
			{
				String urlValue = urlMapping.url();
				if(url.equals(urlValue))
				{
					method.invoke(instance, new Object[] {});
				}
			}
		}
	}
}
