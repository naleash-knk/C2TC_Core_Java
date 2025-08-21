package day6.staticvariable;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		System.out.println(Employee.companyName);
		Employee e = new Employee("Thamizh", 20220601);
		System.out.println(e);

		e = new Employee("Nalesh", 20220602);
		System.out.println(e);
	}

}
