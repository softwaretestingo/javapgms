package com.softwaretestingo.stringbuffer;
public class StringBufferAppendEx 
{
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Software");
		// appends a string in the previously defined string.
		str.append("Testingo"); 
		System.out.println("After Append the Value: "+str);
	}
}