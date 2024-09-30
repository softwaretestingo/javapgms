package com.softwaretestingo.sto000collectedpgms.interviewprograms.reverse;
public class STO0030_0_ReverseAfterSplit 
{
	/*
	 * Input :Hello world,welcome to my world,my world 
	 * Output:world Hello ,world my to welcome ,world my  
	 * my Condition: without using predefined function
	 */
	public static void main(String[] args) 
	{
		String str1 = "Hello world,welcome to my world,my world";
		System.out.println("Input: "+str1);
		String arr[] = str1.split(",");
		String res = "";
		for(int i=0;i<arr.length;i++) 
		{
			String[] de = arr[i].split(" ");
			for(int j=de.length-1;j>=0;j--) 
			{
				res = res + de[j] + " ";
			}
			res = res + ",";
		}
		res = res.substring(0,res.length()-1);
		System.out.println("Output: "+res);
	}
}