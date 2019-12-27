package com.java.Strem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted 
{
	public static void main(String[] args) 
	{
		List<Integer> nos = Arrays.asList(2,8,9,1,4,5,7,3);
		List<Integer> orderofnos= nos.stream().sorted().collect(Collectors.toList());
		System.out.println(orderofnos);

	}


}
