package ch14;

import java.util.Scanner;

public class chap14 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		if(age > 14)
		{
			System.out.println("중학생 이상입니다");
		}
		else
		{
			System.out.println("초딩입니다.");
			
		}
		

	}

}
