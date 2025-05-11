package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime time;
	private int age;
	
	//constructor  injection
	
	  public WishMessageGenerator(LocalTime time, int age) { super(); this.time =
	  time; this.age = age; }
	  
		//setter method for setter injection
		/*
		 * public void setTime(LocalTime time) { this.time=time; }
		 */

	
	//bussiness method
	public String showWishMessage(String user) {
       
		//get current hour of the day
		int hour=time.getHour();
		
		//generating wish message based on current hour of day
		if(hour<12) return "Good Morning::"+user;
		else if(hour<16) return "Good Afternoon::"+user;
		else if(hour<20) return "Good Evening::"+user;
		else return "Good Night::"+user;
	}
  
}
