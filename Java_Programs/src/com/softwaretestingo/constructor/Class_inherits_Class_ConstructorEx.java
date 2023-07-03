package com.softwaretestingo.constructor;
class a
{
   a()
   {
      System.out.println("Super Class Constructor Called");
   }
}
public class Class_inherits_Class_ConstructorEx  extends a
{
	//Child Class Constructor called parent class constructor
	public Class_inherits_Class_ConstructorEx()
	{
		
	}
	public static void main(String[] args)
	{
		Class_inherits_Class_ConstructorEx obj=new Class_inherits_Class_ConstructorEx();
	}
}