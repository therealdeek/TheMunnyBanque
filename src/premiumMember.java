public class premiumMember extends acctInfo
{
    private int membershipPoints, loanDiscount;
    private String ammenityAccess1;


    public premiumMember(String fName, String lName, String emailAddress,
                         int acctNum, int phoneNum, long initialBalance,
                         int premiumMbrPoints, int premiumLoanDiscount,
                         String premiumAmmenity1)
    {
        super(fName, lName, emailAddress, acctNum, phoneNum, initialBalance);
        membershipPoints = premiumMbrPoints;
        loanDiscount = premiumLoanDiscount;
        ammenityAccess1 = premiumAmmenity1;
    }

    public int getMembershipPoints() {
        return membershipPoints + 200;
    }

    public void setMembershipPoints(int membershipPoints) {
        this.membershipPoints = membershipPoints;
    }

    public int getLoanDiscount() {
        return loanDiscount *= .05;
    }

    public void setLoanDiscount(int loanDiscount) {
        this.loanDiscount = loanDiscount;
    }

    public String getAmmenityAccess1() {
        return ammenityAccess1;
    }

    public void setAmmenityAccess1(String ammenityAccess1) {
        this.ammenityAccess1 = ammenityAccess1;
    }

    @Override

    public String toString()
    {
        return super.toString() + ", " + " is a Premium Member." +
                " The available benefits are: " + "Membership Points: " + membershipPoints
                + ", " + "Discounts on loans are: " + loanDiscount +
                " dollars per loan taken out over $1,000." +
                ", " + "Available ammenties are: " + ammenityAccess1;
    }
}
