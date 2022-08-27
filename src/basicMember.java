/*
This is the profile for the Basic Member. Every other member class
should resemble this with a few exceptions for elevated memberships.
 */

public class basicMember extends acctInfo
{
    public basicMember(String fName, String lName, String emailAddress,
                       int acctNum, int phoneNum, long initialBalance)

    {
        super(fName, lName, emailAddress, acctNum, phoneNum, initialBalance);
    }

    @Override
    public String toString()
    {
        return super.toString() + " and " + getfName() +
                " is a Basic Member.";
    }

    public String checkingAcct()
    {
       double initialAmt = 100;
        return "The new account balance for " +
                getfName()+  " " + "is: " + "$" + (balance+ initialAmt)
                + " dollars";
    }

    public String loanAcct()
    {
        double amount = 1000;
        return "The loan amount for " + getfName() + " is " + "$"+
                amount +  " dollars";
    }
}
