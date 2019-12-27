package com.java.MethodReference;
class Demo2
{
	Demo2()
	{
		System.out.println("Constructor in Demo2 Class");
	}
}
public class ConstructorReference 
{
	public static void main(String[] args) 
	{
		Flyable f=Demo2::new;
		f.fly();
			
	}

	
}
