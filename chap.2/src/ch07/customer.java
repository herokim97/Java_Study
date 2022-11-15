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
		return "키가 " + customerHeight + " 이고 몸무게가 " + customerWeight + " 킬로인 " + customerGender + "이 있습니다. 이름은 " + customerName + "이고 나이는 " + customerAge + "세 입니다."; 
	}
}
