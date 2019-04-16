package org.samples;

public class Hello {

	private int add(int a, int b)
	{
		int c= a+b;
		return c;
	}
	
	

public static void main(String[]args)
{
	Hello h = new Hello();
	
	int c=h.add(10, 20);
			
			System.out.println(c);
}
}
