package com.softwaretestingo.sto011_STRINGS;
import java.util.GregorianCalendar;
public class StringBuffervsStringBuilder 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Difference Between StringBuffer and StringBuilder
	 * 
	 */
	public static void main(String[] args) 
	{
		System.gc();
		long start=new GregorianCalendar().getTimeInMillis();
		long startMemory=Runtime.getRuntime().freeMemory();
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<100000; i++)
		{
			sb.append(":"+i);
			sb.insert(i, "Hi");
		}
		long end=new GregorianCalendar().getTimeInMillis();
		long endMemory=Runtime.getRuntime().freeMemory();
		System.out.println("Time Taken: "+(end-start));
		System.out.println("Memory used: "+(startMemory-endMemory));
	}
}