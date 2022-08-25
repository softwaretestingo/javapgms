package com.softwaretestingo.string;
class ex5
{  
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