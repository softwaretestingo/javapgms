package com.softwaretestingo.sto000collectedpgms.interviewprograms.reverse;
public class STO0002_0_ReverseStringWithOutChangingOrderOfNumbers 
{
	// For More Programs Visit: https://www.softwaretestingo.com/
	/* Input - today10is20my30interview. 
	 * Output- yadot10si20ym30weivretni.
	 */
	public static void main(String[] args) 
	{
		String s = "today110is210my310interview";
		System.out.println("Input:  "+s);
		String[] arr = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		for (int i = 0; i< arr.length; i++) 
		{
			if(!Character.isDigit(arr[i].charAt(0)))
			{
				arr[i] = String.valueOf(new StringBuilder(arr[i]).reverse());
			}
		}
		System.out.println("Output: "+String.join("", arr));
	}
}