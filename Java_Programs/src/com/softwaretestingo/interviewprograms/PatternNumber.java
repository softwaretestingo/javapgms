package com.softwaretestingo.interviewprograms;
public class PatternNumber 
{	
	/*
	 * 1 
	 * 1 2 
	 * 1 2 3 
	 * 1 2 3 4 
	 * 1 2 3 
	 * 1 2 
	 * 1
	 */

	public static void main(String[] args) 
	{
		int n = 5;

		for (int i = 1; i < n; i++) 
		{ 
			for(int j=1;j<=i;j++) 
			{ 
				System.out.print(j); 
			}

			System.out.println(" ");
		}

		for(int p=n-2; p>=1;p--)   // p=3,2  3>=1 
		{
			for(int q=1;q<=p;q++)    // q=1,2,3,4  1<=3  2<=3 3<=3 4<=3
			{
				System.out.print(q);  //123  
			}
			System.out.println(" ");
		}
	}
}