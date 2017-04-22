package com.factory;

public class MainClass {
	public static void main(String[] args) {
		FactoryMobile mobf = new FactoryMobile();
		Mobile mob = mobf.instance("iphone");
		mob.show();
		
	}

}
