package com.softwaretestingo.basic;
public class HashcodeExample 
{
	public static void main(String[] args) 
	{
		//Create integer object  
        Integer i = new Integer("789456");  
        //Returned hash code value for this object   
        int hashValue = i.hashCode();  
        System.out.println("Hash code Value for object is: " + hashValue); 
        
        HashcodeExample obj=new HashcodeExample();
        HashcodeExample obj1=new HashcodeExample();
        
		System.out.println("Hashcode Value Of Obj: "+obj.hashCode());
		System.out.println("Hashcode Value Of Obj1: "+obj1.hashCode());
	}
}