package ch24;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 50);
		studentKim.addSubject("수학", 50);
		studentKim.addSubject("영어", 50);
		
		studentLee.showStudentInfo();
		System.out.println("=============");
		studentKim.showStudentInfo();
	}

}
