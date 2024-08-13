package com.softwaretestingo.sto01401_innerclass;
public class STO0001_2_AnonymousInnerClassEx3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Java Anonymous class as argument of method / constructor
	 * 
	 */
	public static void main(String[] args) 
	{
		// Anonymous inner class as constructor argument
		new Thread( new Runnable() 
		{
			public void run()
			{
				for(int i=0; i<5; i++) 
				{
					System.out.println("Test Thread");
				}
			}
		}).start();
		for(int i=0; i<5; i++)
		{
			System.out.println("Main Thread");
		}
	}
}