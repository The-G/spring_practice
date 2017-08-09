package com.doit.jihyuk.di01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = 
				new GenericXmlApplicationContext(TVUser.class,"beaninit.xml");
		
		TV tv = (TV) context.getBean("appleTV"); //AppleTV.class에 @Component를 해줬기 때문이다!!
		
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();

	}
}
