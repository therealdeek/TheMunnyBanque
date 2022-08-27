public class basicMember extends acctInfo
{
    public basicMember(String fName, String lName, String emailAddress, int acctNum, int phoneNum)

    {
        super(fName, lName, emailAddress, acctNum, phoneNum);
    }

    @Override
    public String toString()
    {
        return super.toString() + ", " + " is a Basic Member.";
    }
}
