package ch17;

import java.util.Scanner;

public class chap17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 람보르기니 700,000,000원 를 구매하고 싶다 월 3,500,000원을 저축 할 수 있다면 몇 개월이 걸리는가
		// 1) 나눠서 몫을 구하는 방법
		// 2) while 문을 통해 count를 증가시키는 방법
		Scanner sc = new Scanner(System.in);
		int car = 700000000;
		int pay = 3500000;
		int month = car/pay;
		int count = 0;
		int day = car%pay;

		System.out.println(month);
		System.out.println(day);
		
		while(true)
		{
			pay *= count;
			count++;
			if(pay > car)
			{
				break;
			}
		
		}
		System.out.println(count);

		
		
	}
	

}
