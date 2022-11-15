package ch18;

public class Company {
	private Company() {} //������ 
	
	private static Company instance = new Company(); // Ŭ���� ���� ������ private �ν��Ͻ� ����
	
	public static Company getInstance()
	{
		if(instance == null)
		{
			instance = new Company();
		}
		return instance;
	}
	

}
