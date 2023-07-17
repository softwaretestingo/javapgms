package com.softwaretestingo.interviewprograms;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
public class InterviewPrograms1 
{
	// For More Programs Visit: https://www.softwaretestingo.com/
	
	/*Input String arr[] = {"Rama", "Test", "Type", "Tata"}
	Output should be  - "RTTTaeypmsptatea" */
	public static void main(String[] args) 
	{
		String arr[] = {"Rama", "Test", "Type", "Tata"};
		System.out.println("Inpu Array Is: "+ "{\"Rama\", \"Test\", \"Type\", \"Tata\"}");
		LinkedHashMap<Integer, ArrayList<String>> map= new LinkedHashMap<>();
		String ans="";
		for (int i = 0; i<=arr.length-1; i++) {
			String word= arr[i];
			for (int j = 0; j <=word.length()-1; j++) {
				ArrayList<String> list= new ArrayList<>();
				if(map.containsKey(j))
				{
					ArrayList<String> list1= map.get(j);
					list1.add(String.valueOf(word.charAt(j)));
					map.put(j, list1);
				}
				else {
					list.add(String.valueOf(word.charAt(j)));
					map.put(j, list);
				}
			}
		}
		for(Map.Entry<Integer, ArrayList<String>> e:map.entrySet())
		{
			// System.out.print(e.getKey()+"" +e.getValue());
			ArrayList<String> l1= e.getValue();
			for (int i = 0; i <=l1.size()-1; i++) {
				ans=ans+l1.get(i);
			}
		}
		System.out.println("Expected Output Is: "+ans);
	}
}