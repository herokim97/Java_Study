package ch12;

public class chap12 {
	public static void main(String[] args)
	{
		int a = 10;
		int b = 2;
		
		boolean value = ((a = a+ 10)<10) && ((b = b+2) < 10);
		System.out.println(value);
		System.out.println(a);
		System.out.println(b);
		
		value = ((a = a+10)<10) || ((b = b+2)< 10);
		System.out.println(value);
		System.out.println(a);
		System.out.println(b);
	}

}
