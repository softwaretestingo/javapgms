package com.softwaretestingo.innerclass;
//Java anonymous class that implements an interface
public class AnonymousInnerClassEx2 
{
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