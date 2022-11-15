package ch03;

public class GoldCustomer extends Customer {
	private int agentID;
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName)
	{
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.03;
		salesRatio = 0.05;
		
		System.out.println("GoldCustomer(int, String) 생성자 호출 ");
	}
	
	public int getAgentID()
	{
		return agentID;
	}

}
