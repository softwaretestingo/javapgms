package com.softwaretestingo.string;

class Parent
{
	//Super Class Variable
	int var=111;
}
public class Super_Keyword_With_Variable extends Parent 
{
	//Child Class Variable
	int var=222;
	
	public void printSuperVar()
	{
		System.out.println("Parent Class Var Value: "+super.var);
	}
	public static void main(String[] args) 
	{
		Super_Keyword_With_Variable obj=new Super_Keyword_With_Variable();
		System.out.println("The Value Of Local Variable: " + obj.var);
		obj.printSuperVar();
	}
}