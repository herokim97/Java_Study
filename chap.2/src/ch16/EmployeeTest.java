package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("¿Ã¿Ã¿Ã");
		
		System.out.println(Employee.getSerialNum());

		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("±Ëøµøı");
		
		System.out.println(employeeLee.getEmployeeName() + " , " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + " , " + employeeKim.getEmployeeId());
		
		

	}

}
