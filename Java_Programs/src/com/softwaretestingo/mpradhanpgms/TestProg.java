package com.softwaretestingo.mpradhanpgms;

public class TestProg {

	static int i,n;
	public static void main(String args[])
	{
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}		
}
class Testprog1 extends TestProg
{
	public void m()
	{
		int n=i/i+1;
		System.out.println(n);
	}
	
}