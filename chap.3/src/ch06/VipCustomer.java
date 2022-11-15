package ch06;

public class VipCustomer extends Customer {
	
	public int agentID;
	double salesRatio;
	
	
	public VipCustomer(int customerID, String customerName, int agentID)
	{
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;

	}
	
	@Override
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
	public int getAgentID()
	{
		return agentID;
	}
	
	
	public String showCustomerInfo()
	{
		return super.showCustomerInfo()+" 담당 상담원 번호는 " + agentID + "입니다.";
	}
	

	
	

}
