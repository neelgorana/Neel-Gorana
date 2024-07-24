package day1;

public class DemoEmployee {
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee();
		
		e1.setName("Neel");
		e1.setEmail("neel@gmail.com");
		e1.setAddress("Xyz Steet");
		e1.setDesig("Devloper");
		e1.setSalary(25000);
		
		System.out.println(e1);
		
	}

}