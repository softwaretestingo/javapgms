package com.softwaretestingo.interviewprograms;
public class InterviewPrograms30 
{
	/*
	 * Input :Hello world,welcome to my world,my world 
	 * Output:world hello ,world my to welcome ,world 
	 * my Condition: without using predefined function
	 */
	public static void main(String[] args) 
	{
		String str1 = "Hello world,welcome to my world,my world";
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
		System.out.println(res);
	}
}