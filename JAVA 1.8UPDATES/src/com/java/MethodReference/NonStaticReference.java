package com.java.MethodReference;
class Demo1
{

	public  void test()
	{
		System.out.println("This is an Static Reference Method");
	}
}
public class NonStaticReference 
{
	public static void main(String[] args) 
	{    
		Demo1 k = new Demo1();
		Flyable f = k::test;
		f.fly();
		
		
		//Flyable f= Demo::test;   ->This is for Static Reference
		//f.fly();    -> This is for Static Reference
	}
   

}
