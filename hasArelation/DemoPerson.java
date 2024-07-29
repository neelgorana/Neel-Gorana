package hasArelation;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add = new Address();
		add.setFlatno("104");
		add.setSocityname("Vinayak Apartment");
		add.setArea("Ahmedabad");
		add.setPincode(380015);
		System.out.println(add);
		
		Person ps = new Person();
		ps.setAddr(add);
		ps.setPemail("neelgorana@gmail.com");
		ps.setPname("Neel");
		System.out.println(ps);
	// injection object of address class to person class 
	
	}
	
}