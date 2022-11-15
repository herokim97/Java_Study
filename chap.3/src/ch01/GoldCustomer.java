package ch01;

public class GoldCustomer extends Customer {
	private int agentID;
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName)
	{
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.03;
		salesRatio = 0.05;
	}
	
	public int getAgentID()
	{
		return agentID;
	}

}
