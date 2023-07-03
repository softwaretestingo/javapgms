package com.softwaretestingo.basic;
public class SimpleObjectComparisonExample 
{
	public static void main(String[] args) 
	{
		// Creating Constructor of the Double class   
		Double value1 = new Double(111.222);  

		// Creating constructor of the Long class   
		Long value2 = new Long(33333);  

		//invoking the equals() method   
		System.out.println("Objects are not equal, hence it returns: " + value1 .equals(value2));  
		System.out.println("Objects are equal, hence it returns:  " + value1.equals(111.222));  
	}
}