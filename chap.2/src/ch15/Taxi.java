package ch15;

public class Taxi {
	String TaxiName;
	int money;
	
	public Taxi(String TaxiName)
	{
		this.TaxiName = TaxiName;
	}
	
	public void take(int money)
	{
		this.money += money;
	}
	
	public void showTaxiInfo()
	{
		System.out.println(TaxiName + " ������ " + money + "���� �ϴ�.");
	}
	
	
	
	

}
