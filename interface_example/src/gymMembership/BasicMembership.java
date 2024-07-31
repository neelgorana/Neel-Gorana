package gymMembership;

public class BasicMembership implements Membership {
    private double fee = 20;

    @Override
    public void displayMembershipDetails() {
        System.out.println("Basic membership includes access to cardio equipment only.");
    }

    @Override
    public double calculateMembershipFee() {
        return fee;
    }
    
}
