package ch02;

public class EqualsTest {
	public static void main(String[] args)
	{

	Student std1 = new Student(111,"kim");
	Student std2 = new Student(111,"kim");
//	Student std3 = std1;
	
	
	System.out.println(std1 == std2);
	System.out.println(std1.equals(std2));
	}
}
