package ch01;

public class VipCustomer extends Customer {
	
	private int agentID;
	double salesRatio;
	
	public VipCustomer(int customerID, String customerName)
	{
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIP Customer() ������ ȣ��");
		
	}
	
	
	
	public int getAgentID()
	{
		return agentID;
	}
	

}
