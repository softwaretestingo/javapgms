package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
public class STO0024_1_SortByCharFrequency 
{
	/**
	 * We need to sort the string base on character size
	 * Input: 1222cccbbbbaaaammmmmmm
	 * Output: 1222cccaaaabbbbmmmmmmm
	 */
	public static void main(String[] args) 
	{
		String input = "1222cccbbbbaaaammmmmmm";
		System.out.println("Input: "+input);
		Map<String, Integer> outputMap = new HashMap<>();
		for (String letter : input.split("")) 
		{
			outputMap.compute(letter, (k,v)->v==null?1:v+1);
		}
		//System.out.println("Output: "+outputMap);
		Map<Integer, List<String>> inversed =
					outputMap
					.entrySet()
					.stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
					inversed.values().forEach(list->list.sort(null));
		System.out.print("Output: ");
					new TreeMap<>(inversed).forEach((k,v)->v.forEach(letter-> System.out.print(letter.repeat(k))));
	}
}
