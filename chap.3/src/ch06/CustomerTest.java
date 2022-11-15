package ch06;
import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args)
	{
//		Customer customerKim = new Customer(16111955, "±è¿µ¿õ");		
//		customerKim.bonusPoint = 15000;
//		int price = customerKim.calcPrice(5000);
//		System.out.println(customerKim.showCustomerInfo() + " " + price);
//		
//		
//		VipCustomer customerLee = new VipCustomer(20222455, "°­½Ã¿¬");
//		customerLee.bonusPoint = 20000;
//		price = customerLee.calcPrice(10000);
//		System.out.println(customerLee.showCustomerInfo()+ " " + price);
//		
//		
//		GoldCustomer customerJang = new GoldCustomer(16111444, "Àå¼öÈ£");
//		customerJang.bonusPoint = 10000;
//		System.out.println(customerJang.showCustomerInfo());
//		
		
		ArrayList<Customer> customerList = new ArrayList<Customer> ();
		Customer customerA = new Customer(1000, "A");
		Customer customerB = new Customer(1001, "B");
		Customer customerC = new GoldCustomer(1002, "C");
		Customer customerD = new GoldCustomer(1003, "D");
		Customer customerE = new VipCustomer(1004, "E", 12345);
		
		customerList.add(customerA);
		customerList.add(customerB);
		customerList.add(customerC);
		customerList.add(customerD);
		customerList.add(customerE);
		
		if(customerD instanceof GoldCustomer )
		{
			GoldCustomer vc = (GoldCustomer)customerD;
			System.out.println(customerD.showCustomerInfo());
			
			
		}
		
//		System.out.println("==== input customer information ===");
//		
//		for(Customer customer : customerList)
//		{
//			System.out.println(customer.showCustomerInfo());
//		}
//		
//		int price = 10000;
//		
//		for(Customer customer : customerList)
//		{
//			int cost = customer.calcPrice(price);
//			System.out.println(customer.getCustomerName()+" pay " + cost + " doallr ");
//			System.out.println(customer.getCustomerName()+ " 's point = " + customer.bonusPoint );
//			
//		}
//		System.out.println(customerE.showCustomerInfo());
//		
	}
}
