package ch15;

import java.util.Scanner;


public class chap15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		int charge;
		
		if(age < 8)
		{
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}
		else if(age < 14)
		{
			charge = 2000;
			System.out.println("초등학생입니다");
		}
		else if(age < 20)
		{
			charge = 3000;
			System.out.println("중, 고등학생입니다.");
		}
		else
		{
			charge = 5000;
			System.out.println("성인입니다.");
		}
		
		System.out.println("입장료는 " + charge + " 원 입니다.");
	}

}
