package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.Arrays;
public class STO0010_0_PrintEvenOdd 
{
	/**
	 * Input Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
	 * Even numbers: 2 4 6 8 10 
	 * Total Number of Even Numbers in this Array = 5
	 * Odd numbers: 1 3 5 7 9 11 
	 * Total Number of Odd Numbers in this Array = 6
	 * 
	 */
	public static void main(String[] args) 
	{
		int num[]= {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println("Input Array: "+Arrays.toString(num));
		int evenCount = 0, oddCount = 0;
		
		System.out.print("Even numbers: ");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0) {
				System.out.print(num[i]+" ");
				evenCount++;
			}
		}
		System.out.println();
		System.out.println("Total Number of Even Numbers in this Array = " + evenCount);
		System.out.print("Odd numbers: ");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==1) 
			{
				System.out.print(num[i]+" ");
				oddCount++;
			}	
		}
		System.out.println();
		System.out.println("Total Number of Odd Numbers in this Array = " + oddCount);
	}
}