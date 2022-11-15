package ch07;

public class Customerinfo {

	public static void main(String[] args)
	{
		customer Tomas = new customer();
		Tomas.customerHeight = 180;
		Tomas.customerWeight = 78;
		Tomas.customerGender = "³²¼º";
		Tomas.customerName = "Tomas";
		Tomas.customerAge = 37;
		
		System.out.println(Tomas.showcustomerInfo());
	}
}

