package ch04;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.studentName = "�迵��";
		studentLee.address = "���";
		studentLee.studentID = 16;
		studentLee.showStudentInfo();
		
		Student studentGuak = new Student();
		studentGuak.studentName = "������";
		studentGuak.address = "�Ͼ�";
		studentGuak.studentID = 19;
		
		studentGuak.showStudentInfo();
	

	}

}
