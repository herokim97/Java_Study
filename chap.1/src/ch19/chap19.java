package ch19;
import java.util.Scanner;
public class chap19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < 10; i++)
		{
			sum += count;
			count ++;
		}
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		
		while (num <= 10)
		{
			total += num;
			num ++;
		}
		System.out.println(total);

	}

}
