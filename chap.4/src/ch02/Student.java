package ch02;

public class Student {
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName)
	{
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString()
	{
		return studentId+ " " + studentName;
	}

	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student)
		{
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
			{
				return true;
			}
			else
				return false;
		}
		return false;
	}
	
	
	

}
