package com.softwaretestingo.thiskeyword;
class ex5
{  
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Passing this as Argument
	 * 
	 */
	void ab(ex5 t) 
	{ 
		System.out.println("Ab Method called"); 
	} 
	void ac()  
	{ 
		/* Passing this keyword as an argument in the ab method and it will 
		 * pass the reference of current class object to the ab method.
		 */
		ab(this);  
	} 
}  
public class ThisKeywordEx4 
{
	public static void main(String[] args) 
	{
		ex5 obj=new ex5();
		obj.ac();
	}
}