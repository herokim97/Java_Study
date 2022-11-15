package ch08;

public class Student {
	int studentID;
	String studentName;
	
	 Subject Korea;
	 Subject math;
	 
	 public Student(int id, String name)
	 {
		 studentID = id;
		 studentName = name;
		 
		 Korea = new Subject();
		 math = new Subject();
	 }
	 
	 public void setKoreaSubject(String name, int score)
	 {
		 Korea.subjectName = name;
		 Korea.score = score;
	 }
	 
	 public void setMathSubject(String name, int score)
	 {
		 math.subjectName = name;
		 math.score = score;
	 }
	 
	 public void showStudentScore()
	 {
		 int total = Korea.score + math.score;
		 System.out.println(studentName+"(" + studentID + ")" + " �� �� ������ " + total + " �Դϴ�.");
		 System.out.println("���� ������ : " + Korea.score + ", ���� ������ : " + math.score );
	 }

}
