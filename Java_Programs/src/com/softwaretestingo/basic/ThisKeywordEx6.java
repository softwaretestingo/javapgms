package com.softwaretestingo.basic;
class ex8
{  
	// Declare an Instance Method with return class type (ex8) 
	ex8 show()
	{
		return this;
	}
	void msg()
	{
		System.out.println("Displaying Message");
	}

}  
public class ThisKeywordEx6 
{
	public static void main(String[] args) 
	{
		new ex8().show().msg();
	}
}