package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create IOC Container
		FileSystemXmlApplicationContext ctx =
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get Target Spring Bean class Obj Ref
		WishMessageGenerator generator=ctx.getBean("wmg", WishMessageGenerator.class);
		
		//invoke the business method
		
		String result = generator.showWishMessage("Raja");
		System.out.println("............... "+result);
		
		//close the IOC container
		ctx.close();
  
	}

}
