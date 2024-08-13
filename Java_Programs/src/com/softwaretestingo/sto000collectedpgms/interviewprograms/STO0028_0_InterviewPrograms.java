package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0028_0_InterviewPrograms 
{
	/*
	 * Input String // My n@me is 12Rahul 
	 * Output String // yM em@n si 12luhaR 
	 * Only charcters should be Character, special characters and numbers should be displayed as it is.
	 */
	public static void main(String[] args) 
	{
		String str = "My n@me is 12Rahul";
		String result="";
		String[] py = str.split(" ");
		int counter=0;
		for(int i=0;i<py.length;i++) 
		{
			String tem = py[i];
			for(int gg = tem.length()-1; gg>=0; gg--) 
			{
				if(!Character.isDigit(tem.charAt(counter))) 
				{
					result = result + tem.charAt(gg+counter);
				}
				else
				{
					result = result + tem.charAt(counter);
					counter++;
				}
			}
			result = result+ " ";
			counter=0;
		}
		System.out.println(result);
	}
}