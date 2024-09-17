package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.ArrayList;
import java.util.List;

public class STO0110_0_InterviewPrograms 
{
	//
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<>();
        list1.add("person1");
        list1.add("person2");
        list1.add("person3");
        
        List<String> list2 = new ArrayList<>();
        list2.add("person2");
        list2.add("person5");

        List<String> uniqueElements = findUniqueElements(list1, list2);

        System.out.print("Values in list2 that are not present in list1: ");
        for (String element : uniqueElements) 
        {
            System.out.println(element);
        }

	}
	public static List<String> findUniqueElements(List<String> list1, List<String> list2) 
	{
        List<String> uniqueElements = new ArrayList<>();
        
        for (String element : list2) 
        {
            if (!list1.contains(element)) 
            {
                uniqueElements.add(element);
            }
        }    
        return uniqueElements;
    }
}