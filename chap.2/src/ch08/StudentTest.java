package ch08;

public class StudentTest {
	public static void main(String[] args)
	{
		Student studentKim = new Student(16111955, "kim");
		studentKim.setKoreaSubject("국어", 100);
		studentKim.setMathSubject("수학", 95);
		
		Student studentJang = new Student(2000458, "Jang");
		studentJang.setKoreaSubject("국어" , 95);
		studentJang.setMathSubject("수학", 100);
		
		studentKim.showStudentScore();
		studentJang.showStudentScore();
	}
}
