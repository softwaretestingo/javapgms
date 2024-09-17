package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Random;
public class STO0069_0_GenerateRandomNumber 
{	
	public static void main(String[] args) 
	{	
		Random rn= new Random();
		int n = rn.nextInt(10);
		System.out.println(n);
	}
}