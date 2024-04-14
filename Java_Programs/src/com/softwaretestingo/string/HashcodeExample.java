package com.softwaretestingo.string;
public class HashcodeExample 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Print The HashCode Of The Object
	 * 
	 */
	public static void main(String[] args) 
	{
		int hashValue = Integer.hashCode(185);  
		System.out.println("Hash code Value for object is: " +hashValue); 

		HashcodeExample obj=new HashcodeExample();        
		System.out.println("Hashcode Value Of Obj: "+obj.hashCode());

	}
}