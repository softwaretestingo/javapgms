package com.softwaretestingo.sto028_EXCEPTIONHANDLING;
public class STO0004_0_UserDefinedCustomException extends Exception
{
	String str1;
	/* Constructor of a custom exception class
	 * here I am copying the message that we are passing while
	 * throwing the exception to a string and then displaying
	 * that string along with the message.
	*/
	STO0004_0_UserDefinedCustomException(String str2) 
	{
		str1 = str2;
	}

	public String toString() 
	{
		return ("MyException Occurred: " + str1);
	}

	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new STO0004_0_UserDefinedCustomException("This is My error Message");
		} 
		catch (STO0004_0_UserDefinedCustomException exp) 
		{
			System.out.println("Catch Block");
			System.out.println(exp);
		}
	}
}