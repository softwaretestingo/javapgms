package com.softwaretestingo.ProgramsOnNumbers;
import java.util.Scanner;
public class ReverseNumberEx4 
{
	public static void main(String[] args) 
	{
		int num=0;
		int reversenum =0;
		System.out.println("Input your number and press enter: ");
		//This statement will capture the user input
		Scanner in = new Scanner(System.in);
		//Captured input would be stored in number num
		num = in.nextInt();
		getReverse(num);
	}
	static void getReverse (int num)
	{
		if (num == 0)
			return;

		int rem = num % 10;
		System.out.print (rem);

		getReverse (num / 10);
	}
}