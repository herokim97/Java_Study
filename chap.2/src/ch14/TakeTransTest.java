package ch14;

public class TakeTransTest {

	public static void main(String[] args)
	{
		Student studentJ = new Student("Jang", 5000);
		Student studentL = new Student("Lee", 10000);
		
		Bus bus100 = new Bus(100);
		
		SubWay subway = new SubWay(2);
		
		studentJ.takeBus(bus100);
		studentL.takeSubWay(subway);
		
		studentJ.showInfo();
		studentL.showInfo();
		
		bus100.showBusInfo();
		subway.showSubWayInfo();
	}
}
