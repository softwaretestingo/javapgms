package com.softwaretestingo.basic;
class accessormutator
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Getter and Setter Method Example
	 * @param args
	 */
	//private variable
	private int value=10;

	// Mutator method (setter)
	public void setValue(int a)
	{ 
		// return balance + a;
		value=value+a;
	}
	
	// accessor method (getter)
	public int getValue()
	{
		return value;
	}

}
public class GettersSettersEx 
{
	public static void main(String[] args) 
	{
		accessormutator obj=new accessormutator();
		
		//setting new value
		obj.setValue(30);
		
		//Retriving The Value
		System.out.println("Your Value : "+obj.getValue());
	}
}