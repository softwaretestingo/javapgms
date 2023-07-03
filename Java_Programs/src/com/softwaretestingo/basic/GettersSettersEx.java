package com.softwaretestingo.basic;
class accessormutator
{
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
		
		System.out.println("Your Value : "+obj.getValue());
	}
}