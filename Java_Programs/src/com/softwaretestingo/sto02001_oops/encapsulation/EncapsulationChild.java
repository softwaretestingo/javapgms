package com.softwaretestingo.sto02001_oops.encapsulation;
public class EncapsulationChild 
{
	public static void main(String args[])
	{
		EncapsulationParent obj=new EncapsulationParent();
		obj.name="SoftwareTestingo";
		
		System.out.println("The Name: "+obj.name);
	}
}