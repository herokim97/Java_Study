package ch14;

public class SubWay {
	int lineNumber;
	int passengerCount;
	int money;
	
	public SubWay(int lineNumber)
	{
		this.lineNumber = lineNumber;
	}
	
	public void take(int money)
	{
		this.money += money;
		passengerCount++;
	}
	
	public void showSubWayInfo()
	{
		System.out.println(lineNumber + "�� ����ö�� �°��� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�");
	}

}
