package com.softwaretestingo.sto01401_innerclass;
public class STO0001_1_AnonymousInnerClassEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Java anonymous class that implements an interface
	 * 
	 */
	public static void main(String[] args) 
	{
		// Implementing Runnable Interface and overriding run()
		Runnable r = new Runnable() 
		{
			public void run() 
			{
				for (int i = 0; i < 5; i++) 
				{
					System.out.println("Test Thread");
				}
			}
		};
		Thread thread = new Thread(r);
		thread.start();
		for (int i = 0; i < 4; i++) 
		{
			System.out.println("Main Thread");
		}
	}
}