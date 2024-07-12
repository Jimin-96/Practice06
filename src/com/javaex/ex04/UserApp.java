package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User yc1 = new Customer("jws","j1234","정우성",1000);
		User yc2 = new Customer("yjs","y2345","이효리",2000);
		User yc3 = new Employee("master","m7788","운영자",500);
		
		
		yc1.showInfo();
		yc2.showInfo();
		yc3.showInfo();
		
	}

}
