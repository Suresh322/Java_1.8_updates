package com.java.MethodReference;
class Demo
{

	public static void test()
	{
		System.out.println("This is an Static Reference Method");
	}	
}

public class StaticReference 
{
	public static void main(String[] args) 
	{
		Flyable f= Demo::test;
		f.fly();
	}
   
}
