package com.softwaretestingo.Basic;
public class InstanceVariable 
{
	public String instVariable="Instance Variable";
	public static void main(String[] args) 
	{
		InstanceVariable obj1=new InstanceVariable();
		InstanceVariable obj2=new InstanceVariable();

		System.out.println("Obj1 Value: "+obj1.instVariable);
		System.out.println("Obj2 Value: "+obj2.instVariable);

		//Instance Variable Value Changed
		obj1.instVariable="Variable Value Changed";
		System.out.println("Obj1 Value: "+obj1.instVariable);
		System.out.println("Obj2 Value: "+obj2.instVariable);
	}
}
