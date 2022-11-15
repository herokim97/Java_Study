package ch06;

public class GoldCustomer extends Customer {
	
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName)
	{
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.03;
		salesRatio = 0.05;
		
		
	}
	
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
}
