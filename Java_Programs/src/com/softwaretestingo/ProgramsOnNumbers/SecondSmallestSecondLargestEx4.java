package com.softwaretestingo.ProgramsOnNumbers;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SecondSmallestSecondLargestEx4 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(11,6,2,978,78,45,87,23,9,11,76,56);
		
		//Print Second Highest
		int sechH=list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println("Second Highest Number: "+sechH);
		
		int sechHH=list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second Highest Number: "+sechHH);
		
		//Print Second Lowest
		int secL=list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("Second lowest Number: "+secL);
	}
}