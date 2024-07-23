import com.yourname.assignment.employees.Developer;
import com.yourname.assignment.employees.Manager;
import com.yourname.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
	
	public static void main(String args[]) {
		
		Manager ma = new Manager("Neel",12,23000,"java");
		Developer dev = new Developer("meet",34,34000,"python");
		EmployeeUtilities employeeUtilities = new EmployeeUtilities();
		
		employeeUtilities.display(ma);
		
		System.out.println("Department "+ ma.getDept() );
		System.out.println("\n");
		employeeUtilities.display(dev);
		System.out.println("Language : "+ dev.getLanguage() );

		
	}

}
