package ch07;

public class customer {

	public int customerHeight;
	public int customerWeight;
	public String customerGender;
	public String customerName;
	public int customerAge;
	
	public customer() {}
	
	public customer(int customerHeight, int customerWeight, String customerGender, String customerName, int customerAge )
	{
		this.customerHeight = customerHeight;
		this.customerWeight = customerWeight;
		this.customerGender = customerGender;
		this.customerName = customerName;
		this.customerAge = customerAge;
		
	}
	
	public String showcustomerInfo()
	{
		return "Ű�� " + customerHeight + " �̰� �����԰� " + customerWeight + " ų���� " + customerGender + "�� �ֽ��ϴ�. �̸��� " + customerName + "�̰� ���̴� " + customerAge + "�� �Դϴ�."; 
	}
}
