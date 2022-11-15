package ch14;
import java.util.Scanner;

public class CalcuTest {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Calc calc = new CompleteCalc();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + calc.substract(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + calc.times(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
		
		calc.description();
		
		
		
//		int[] arr = {1,2,3,4,5};
//		Calc.total(arr);
//		
//		System.out.println(Calc.total(arr));
	}
}

