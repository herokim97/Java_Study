package ch24;

import java.util.ArrayList;

public class Student {
	int StudentId;
	String StudentName;
	ArrayList<Subject> subjectList;
	
	public Student(int StduentId, String StudentName)
	{
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	public void addSubject(String SubjectName, int grade)
	{
		Subject subject = new Subject();
		
		subject.setSubjectName(SubjectName);
		subject.setGrade(grade);
		subjectList.add(subject);
	}
	
	public void showStudentInfo()
	{
		int total = 0;
		
		
		for(Subject subject : subjectList) {
			total += subject.getGrade();
			System.out.println("학생" + StudentName + "의" + subject.getSubjectName() + "과목 성적은" + subject.getGrade() + "입니다.");
			
		}
		System.out.println("학생" + StudentName + " 의 총점은" + total + " 입니다.");
	}

}
