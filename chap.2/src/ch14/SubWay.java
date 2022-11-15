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
		System.out.println(lineNumber + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
	}

}
