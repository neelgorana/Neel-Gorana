package gymMembership;


public class PremiumMembership implements Membership {
    private double fee = 60;

    @Override
    public void displayMembershipDetails() {
        System.out.println("Premium membership includes access to all gym facilities, including cardio, weightlifting, and group classes.");
    }

    @Override
    public double calculateMembershipFee() {
        return fee;
    }
}