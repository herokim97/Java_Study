package ch01;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerID, String customerName)
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		this.customerID = customerID;
		this.customerName = customerName;
		
		
		System.out.println("Customer(int, String) 생성자 호출");
		
	}
	
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo()
	{
		return customerName + "'s grade = " + customerGrade +
				" and, bonusPoint is "+ bonusPoint ;
	}
	

}
