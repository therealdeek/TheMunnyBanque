public class eliteMember extends acctInfo
{

    private int membershipPoints, loanDiscount, travelMiles;
    private String ammenityAccess1, ammenityAccess2;


    public eliteMember(String fName, String lName, String emailAddress,
                       int acctNum, int phoneNum, long initialBalance,
                       int eliteMbrPts, int eliteLoanDiscount,
                       int eliteTravelMiles, String eliteAmmenity1,
                       String eliteAmmenity2)
    {
        super(fName, lName, emailAddress, acctNum, phoneNum, initialBalance);

        membershipPoints = eliteMbrPts;
        loanDiscount = eliteLoanDiscount;
        travelMiles = eliteTravelMiles;
        ammenityAccess1 = eliteAmmenity1;
        ammenityAccess2 = eliteAmmenity2;
    }

    public int getMembershipPoints() {
        return membershipPoints + 1_000;
    }

    public void setMembershipPoints(int membershipPoints) {
        this.membershipPoints = membershipPoints;
    }

    public int getLoanDiscount() {
        return loanDiscount *= .10;
            }

    public void setLoanDiscount(int loanDiscount) {
        this.loanDiscount = loanDiscount;
    }

    public int getTravelMiles() {
        return travelMiles + 10_000;
    }

    public void setTravelMiles(int travelMiles) {
        this.travelMiles = travelMiles;
    }

    public String getAmmenityAccess1() {
        return ammenityAccess1;
    }

    public void setAmmenityAccess1(String ammenityAccess1) {
        this.ammenityAccess1 = ammenityAccess1;
    }

    public String getAmmenityAccess2() {
        return ammenityAccess2;
    }

    public void setAmmenityAccess2(String ammenityAccess2) {
        this.ammenityAccess2 = ammenityAccess2;
    }

    @Override

    public String toString()
    {
        return super.toString() + ", " + " is an Elite Member." +
                " The available benefits are: " + "Membership Points: " + membershipPoints
                + ", " + "Traveler Miles are: "+ travelMiles + ", " + "Discounts on loans are: " + loanDiscount +
                " dollars per loan taken out over $5,000." + ", " + "Available ammenties are: " +
                ammenityAccess1 + ", " + ammenityAccess2;
    }
}
