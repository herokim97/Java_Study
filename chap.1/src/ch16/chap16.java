package ch16;
import java.util.Scanner;

public class chap16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
	
		
	
		
		int day = switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 ->{
			System.out.println("한 달은 31일 입니다");
			yield 31;
		}
		
		case 4,6,9,11 ->{
			System.out.println("한 달은 30일 입니다");
			yield 30;
		}
		default->{
			
			System.out.println("존재하지 않는 달 입니다.");
			yield 0;
		}
		
	
	};
	System.out.println(month + "월은 "+ day + "일입니다.");

		
		

	}

}
