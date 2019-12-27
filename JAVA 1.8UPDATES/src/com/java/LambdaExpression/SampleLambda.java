package com.java.LambdaExpression;

public class SampleLambda 
{

	public static void main(String[] args) 
	{
		Flyable  f =()->
		{
			System.out.println("This is an implementation class through Lambda Expression");
		};
		f.fly();
		
		

	}

}
