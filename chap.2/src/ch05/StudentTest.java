package ch05;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student studentLee = new Student();
		
		Student studentLee = new Student(12345, "Lee", 3);
		
		String data = studentLee.showStudentInfo();
		System.out.println(data);
		

	}

}
