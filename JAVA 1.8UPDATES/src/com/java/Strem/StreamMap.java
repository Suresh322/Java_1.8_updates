package com.java.Strem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap 
{

	public static void main(String[] args) 
	{
		List<Integer> nos = Arrays.asList(2,8,9,1,4,5,7,3);
		List<Integer> square = nos.stream().map(s->s*s).collect(Collectors.toList());
		System.out.println(square);

	}

}
