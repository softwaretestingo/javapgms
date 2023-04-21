package com.softwaretestingo.mpradhanpgms;

public class TestProgram extends TestP {

	public void m2() {

		System.out.println("Child Methods");
	}

	public void m1(int a, int b) {

		System.out.println(a+b);
	}

	public static void main(String[] args) {

		TestP obj = new TestProgram();
		//obj.m1(9.0,7);

		TestProgram obj1= new TestProgram();
		//obj1.m1(2,4);
		//obj1.m2();
	}
}
