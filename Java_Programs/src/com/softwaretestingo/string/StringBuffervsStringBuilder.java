package com.softwaretestingo.string;
import java.util.GregorianCalendar;
public class StringBuffervsStringBuilder 
{
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
		System.out.println("Time Taken:"+(end-start));
		System.out.println("Memory used:"+(startMemory-endMemory));
	}
}