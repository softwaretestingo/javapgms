package com.softwaretestingo.mpradhanpgms;

import java.util.HashMap;
import java.util.Map;

public class TestInt {


	public static void m1(String s)
	{
		Map<Character, Integer> baseMap= new HashMap<Character, Integer>();

		char carry[]=s.toCharArray();

		for (char c : carry) {

			if(baseMap.containsKey(c))
			{
				baseMap.put(c,  baseMap.get(c)+1);
			}
			else
			{
				baseMap.put(c, 1);
			}
		}
		System.out.println(baseMap);
	}

	public static void main(String[] args) {

		m1("mojjnoj");
		
		/*String s ="monoj kumar pradhan";

		char carry[]=s.toCharArray();

		for(int i=0;i<=s.length();i++)
		{

			for(int j=1+i;j<=s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{

				}

			}

		}
	}*/
	}
}

