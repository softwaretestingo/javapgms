package com.softwaretestingo.string;
public class HashcodeExample 
{
	public static void main(String[] args) 
	{
		int hashValue = Integer.hashCode(185);  
		System.out.println("Hash code Value for object is: " +hashValue); 

		HashcodeExample obj=new HashcodeExample();        
		System.out.println("Hashcode Value Of Obj: "+obj.hashCode());

	}
}