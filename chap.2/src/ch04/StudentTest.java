package ch04;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.studentName = "±è¿µ¿õ";
		studentLee.address = "°æºÏ";
		studentLee.studentID = 16;
		studentLee.showStudentInfo();
		
		Student studentGuak = new Student();
		studentGuak.studentName = "°û¿¬Èñ";
		studentGuak.address = "ÇÏ¾ç";
		studentGuak.studentID = 19;
		
		studentGuak.showStudentInfo();
	

	}

}
