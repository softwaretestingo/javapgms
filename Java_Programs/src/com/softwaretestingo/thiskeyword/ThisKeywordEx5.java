package com.softwaretestingo.thiskeyword;
class ex6
{  
	ThisKeywordEx5 obj;

	// Declare an Parameterized Constructor and pass object of Class ThisKeywordEx5
	ex6(ThisKeywordEx5 obj)
	{
		this.obj=obj;
	}
	void show() 
	{ 
		System.out.println("Show method is called"); 
		System.out.println("Value of b: " +obj.b); 
	} 
}  
public class ThisKeywordEx5 
{
	int b = 30;

	//Declare the Default Constructor
	ThisKeywordEx5()
	{
		/*Create an object of class ex5 and in that pass the current class (ThisKeywordEx5)
		 * object reference by passing the keyword this */
		ex6 ex=new ex6(this);
		ex.show();

	}
	public static void main(String[] args) 
	{
		ThisKeywordEx5 obj=new ThisKeywordEx5();
	}
}