package gymMembership;

public class StandardMembership implements Membership {
	
    private double fee = 40;

    @Override
    public void displayMembershipDetails() {
        System.out.println("Standard membership includes access to cardio and weightlifting equipment.");
    }

    @Override
    public double calculateMembershipFee() {
        return fee;
    }
}
