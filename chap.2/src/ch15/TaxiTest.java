package ch15;

public class TaxiTest {

	public static void main(String[] args) {
		Person personE = new Person("Edward" , 20000);
		
		Taxi taxi1 = new Taxi("잘 나간다 운수택시");
		
		personE.takeTaxi(taxi1);
		
		personE.showInfo();
		taxi1.showTaxiInfo();
		

	}

}
