package ch17;

import java.util.Scanner;

public class chap17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������� 700,000,000�� �� �����ϰ� �ʹ� �� 3,500,000���� ���� �� �� �ִٸ� �� ������ �ɸ��°�
		// 1) ������ ���� ���ϴ� ���
		// 2) while ���� ���� count�� ������Ű�� ���
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
