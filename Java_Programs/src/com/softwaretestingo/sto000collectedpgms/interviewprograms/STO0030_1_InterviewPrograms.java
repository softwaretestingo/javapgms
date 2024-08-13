package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0030_1_InterviewPrograms 
{
	/*
	 * Input :Hello world,welcome to my world,my world 
	 * Output:world hello ,world my to welcome ,world 
	 * my Condition: without using predefined function
	 */
	public static void main(String[] args) 
	{
		//inbuilt function split();
		String input = "Hello world,welcome to my world,my world" ;
		String output = "";

		//inbuilt function1
		String[] str_array= input.split(",");
		int len1= str_array.length;

		//System.out.println("Level 1 array length "+len1);
		System.out.println("Input String == "+input);
		for (String s : str_array)
		{
			//System.out.println("Level words "+s);
			String[] sub_str_array = s.split(" ") ;
			int len2= sub_str_array.length;

			//System.out.println("Level 2 array length "+len2);
			if(len2>1)
			{
				String gap=" ";
				int c=0;
				for (int i=len2; i>0; i-- )
				{
					if (i==len2)
					{
						//System.out.println("Level 2 Reverse words "+sub_str_array[i-1]);
						output=output+sub_str_array[i-1];
					}
					else
					{
						output=output+gap+sub_str_array[i-1];
					}
					c++;
				}
			}
			//if1 end
			//add , after each string except for the last one in each loop
			if(s==str_array[len1-1])
			{}
			else
				output= output+",";
		} //End of 1st for loop
		System.out.println("Output String == "+output);
	} //main function
	//class end
}
