package com.softwaretestingo.interviewprograms;
public class InterviewPrograms2 
{
	/* Input - today10is20my30interview. 
	 * Output- yadot10si20ym30weivretni.
	 */
	public static void main(String[] args) 
	{
		String s = "today110is210my310interview";
		String[] arr = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		for (int i = 0; i< arr.length; i++) 
		{
			if(!Character.isDigit(arr[i].charAt(0)))
			{
				arr[i] = String.valueOf(new StringBuilder(arr[i]).reverse());
			}
		}
		System.out.println(String.join("", arr));
	}
}