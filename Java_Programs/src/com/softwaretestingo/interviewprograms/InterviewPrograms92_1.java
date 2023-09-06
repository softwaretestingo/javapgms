package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class InterviewPrograms92_1 
{
	//Remove numbers from a String Java using charAt( ) method
	public static void main(String[] args) 
	{
		String str, res="";

		Scanner sc = new Scanner(System.in);
		// Accept any String to remove numbers
		System.out.print("Enter any String to remove numbers: ");
		str = sc.nextLine();

		for(int i=0; i<str.length(); i++)
		{
			if(!Character.isDigit(str.charAt(i))) 
			{
				res += str.charAt(i);
			}
		}
		// Display String without numbers
		System.out.print("String after removing all numbers: " + res);

	}
}