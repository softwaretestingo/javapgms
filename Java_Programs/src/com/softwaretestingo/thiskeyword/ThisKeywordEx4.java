package com.softwaretestingo.thiskeyword;
class ex4
{  
	void ab(ex4 t) 
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
		ex4 obj=new ex4();
		obj.ac();
	}
}