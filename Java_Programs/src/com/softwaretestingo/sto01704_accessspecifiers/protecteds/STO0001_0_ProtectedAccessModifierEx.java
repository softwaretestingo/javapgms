package com.softwaretestingo.sto01704_accessspecifiers.protecteds;
import myPackage.Class_A;
public class STO0001_0_ProtectedAccessModifierEx extends Class_A
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
		STO0001_0_ProtectedAccessModifierEx obj=new STO0001_0_ProtectedAccessModifierEx();
		obj.display();
	}
}