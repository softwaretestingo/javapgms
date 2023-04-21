package com.softwaretestingo.mpradhanpgms;

public class OddEvenInArray_Prog3 {

	public static void main(String[] args) {

		int num[]= {1,2,3,4,5,6,7,8,9,10,11};
		int evenCount = 0, oddCount = 0;
		
		System.out.println("Even numbers: ");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0) {
				System.out.println(num[i]);
				evenCount++;
			}
		}
		System.out.println("Total Number of Even Numbers in this Array = " + evenCount);
		System.out.println("Odd numbers: ");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==1) {
				System.out.println(num[i]);
				oddCount++;
			}	
		}
		System.out.println("Total Number of Odd Numbers in this Array = " + oddCount);
	}
}
