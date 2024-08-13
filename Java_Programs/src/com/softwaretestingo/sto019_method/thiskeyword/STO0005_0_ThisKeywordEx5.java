package com.softwaretestingo.sto019_method.thiskeyword;
class ex7
{  
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Passing Object reference Using this keyword
	 * 
	 */
	STO0005_0_ThisKeywordEx5 obj;

	// Declare an Parameterized Constructor and pass object of Class ThisKeywordEx5
	ex7(STO0005_0_ThisKeywordEx5 obj)
	{
		this.obj=obj;
	}
	void show() 
	{ 
		System.out.println("Show method is called"); 
		System.out.println("Value of b: " +obj.b); 
	} 
}  
public class STO0005_0_ThisKeywordEx5 
{
	int b = 30;

	//Declare the Default Constructor
	STO0005_0_ThisKeywordEx5()
	{
		/*Create an object of class ex5 and in that pass the current class (ThisKeywordEx5)
		 * object reference by passing the keyword this */
		ex7 ex=new ex7(this);
		ex.show();

	}
	public static void main(String[] args) 
	{
		STO0005_0_ThisKeywordEx5 obj=new STO0005_0_ThisKeywordEx5();
	}
}