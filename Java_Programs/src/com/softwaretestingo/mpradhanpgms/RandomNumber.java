package com.softwaretestingo.mpradhanpgms;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		Random rn= new Random();
		int n = rn.nextInt(10);
		System.out.println(n);
	}
}