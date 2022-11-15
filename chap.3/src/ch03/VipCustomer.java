package ch03;

public class VipCustomer extends Customer {
	
	private int agentID;
	double salesRatio;
	
	public VipCustomer(int customerID, String customerName)
	{
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIP Customer(int, String) 생성자 호출");
		
	}
	
	public int getAgentID()
	{
		return agentID;
	}
	

}
