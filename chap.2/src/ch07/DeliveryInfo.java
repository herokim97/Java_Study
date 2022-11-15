package ch07;

public class DeliveryInfo {

	public String DeliveryNumber;
	public String DeliveryPhoneNumber;
	public String DeliveryAddress;
	public String DeliveryDate;
	public String DeliveryTime;
	public int DeliveryCost;
	public String DeliveryMenuNumber;
	
	public DeliveryInfo() {}
	
	public DeliveryInfo(String DeliveryNumber, String DeliveryPhoneNumber, String DeliveryAddress, String DeliveryDate, String DeliveryTime, int DeliveryCost, String DeliveryMenuNumber)
	{
		this.DeliveryNumber = DeliveryNumber;
		this.DeliveryPhoneNumber = DeliveryPhoneNumber;
		this.DeliveryAddress = DeliveryAddress;
		this.DeliveryDate = DeliveryDate;
		this.DeliveryTime = DeliveryTime;
		this.DeliveryCost = DeliveryCost;
		this.DeliveryMenuNumber = DeliveryMenuNumber;
		
	}
	
	public String showDeliveryInfo()
	{
		return 
				"�ֹ� ���� ��ȣ : " + DeliveryNumber + "\n" +
				"�ֹ� �ڵ��� ��ȣ : " + DeliveryPhoneNumber + "\n" +
				"�ֹ� �� �ּ� : " + DeliveryAddress + "\n" +
				"�ֹ� ��¥ : " + DeliveryDate + "\n" +
				"�ֹ� �ð� : " + DeliveryTime + "\n" +
				"�ֹ� ���� : " + DeliveryCost + "\n" +
				"�޴� ��ȣ : " + DeliveryMenuNumber ;
				
	}
}
