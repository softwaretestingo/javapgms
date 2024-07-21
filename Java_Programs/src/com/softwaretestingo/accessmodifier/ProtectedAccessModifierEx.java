package com.softwaretestingo.accessmodifier;
import myPackage.Class_A;
public class ProtectedAccessModifierEx extends Class_A
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Protected: We Can Access Protected Method From Outside Of the Package
	 * 			  But in a Subclass	
	 */
	public static void main(String[] args) 
	{
		ProtectedAccessModifierEx obj=new ProtectedAccessModifierEx();
		obj.display();
	}
}