package ch18;

public class Company {
	private Company() {} //생성자 
	
	private static Company instance = new Company(); // 클래스 내부 유일한 private 인스턴스 생성
	
	public static Company getInstance()
	{
		if(instance == null)
		{
			instance = new Company();
		}
		return instance;
	}
	

}
