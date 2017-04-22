package com.factory;

public class FactoryMobile {
	 public Mobile instance(String type)
	 {
		 if(type.equals(Mobile.Iphone))
		 {
			 return new Iphone();
		 }
		 else if(type.equals(Mobile.Nokia))
		 {
			 return new Nokia();
		 }
		 else if(type.endsWith(Mobile.Samsung))
		 {
			 return new Samsung();
		 }
		 return null;
			  
		 
	 }

}
