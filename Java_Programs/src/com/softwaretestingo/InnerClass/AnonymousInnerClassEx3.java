package com.softwaretestingo.InnerClass;
//Java Anonymous class as argument of method / constructor
public class AnonymousInnerClassEx3 
{
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