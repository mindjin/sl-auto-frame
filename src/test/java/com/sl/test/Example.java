package com.sl.test;

import com.sl.conf.ConfigProperties;

public class Example {

	public static void main(String[] args) {		
	
		String a = ConfigProperties.getProperty("login");
		
		System.out.println(a);
		
	}

}
