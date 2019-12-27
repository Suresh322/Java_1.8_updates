package com.java.Strem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter 
{
	public static void main(String[] args) 
	{
		List<String> n = Arrays.asList("arun","suresh","varun","balaji","somesh","siddarth");
		List<String> orderofn = n.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
		System.out.println(orderofn);

	}


}
