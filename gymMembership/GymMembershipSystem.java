package gymMembership;


public class GymMembershipSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicMembership basic = new BasicMembership();
		StandardMembership standard = new StandardMembership();
		PremiumMembership premium = new PremiumMembership();
		
		System.out.println("Basic Membership Info =>");
	    basic.displayMembershipDetails();
	    System.out.println("Fee => " + basic.calculateMembershipFee()+"\n");

	    System.out.println("Standard Membership Info =>");
	    standard.displayMembershipDetails();
	    System.out.println("Fee =>" + standard.calculateMembershipFee()+"\n");
	   
	    System.out.println("Premium Membership Info =>");
	    premium.displayMembershipDetails();
	    System.out.println("Fee =>" + premium.calculateMembershipFee()+"\n");
		
	}

}
