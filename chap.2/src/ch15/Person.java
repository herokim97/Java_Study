package ch15;

public class Person {

	String PersonName;
	int money;
	
	public Person(String PersonName, int money)
	{
		this.PersonName = PersonName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi)
	{
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo()
	{
		System.out.println(PersonName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}
