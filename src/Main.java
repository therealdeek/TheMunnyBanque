/*

The MunnyBanque is a banking company with unique clients.
The type of clients the bank services are categorically sorted on
a basis of basic, premium, and elite. Each client must hold a
checking account to be a member. Each member receives a
Checking account number, however, premium and elite members are
afforded services not available to basic customers. This program
will store the member's information, provide a means of displaying
such information, and allows for changes to be made and reflected
to show an updated account.
 */

// Checking account class, with a Constructor

class acctInfo
{
    private String fName, lName, emailAddress;
    private int acctNum, phoneNum;
    protected long balance;

    public acctInfo(String fName, String lName, String emailAddress,
                    int acctNum, int phoneNum, long initialBalance)
    {
        this.fName = fName;
        this.lName = lName;
        this.emailAddress = emailAddress;
        this.acctNum = acctNum;
        this.phoneNum = phoneNum;
        this.balance = initialBalance;

    }

    //Getters and Setters to retrieve and set objects

    public void setfName(String fName) {this.fName = fName;}

    public String getfName() {return fName;}

    public void setlName(String lName) {this.lName = lName;}

    public String getlName() {return lName;}

    public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}

    public String getEmailAddress() {return emailAddress;}

    public void setAcctNum(int acctNum) {this.acctNum = acctNum;}

    public String getAcctNum() {return fName + "'s account number is: "
            + acctNum;}

    public void setPhoneNum(int phoneNum) {this.phoneNum = phoneNum;}

    public int getPhoneNum() {return phoneNum;}

    public void setBalance(long balance){this.balance = balance;}

    public String getBalance() {return "The amount added by "
            + fName + " is: " + "$" + balance;}


    @Override
    public String toString()
    {
        return lName+", "+ fName + " | "+ emailAddress+ " | "+
                "The beginning checking account balance is: " + "$" + balance;
    }

}

public class Main
{
    public static void main(String[]args)
    {
        // Scanner sc = new Scanner(System.in);

      basicMember bm1 = new basicMember("Jill", "Banks",
              "jb1rox@gmail.com", 75439, 123456789, 500);

      /*  premiumMember pm1 = new premiumMember("Ted", "Roach",
                "tr2@hotmail.com", 98781, 342654781,
                1000, 250, 100,
                "Massage Chair");

       eliteMember em1 = new eliteMember("Dani", "Tee",
                "dt@icloud.com", 72345, 654321908,
                3000, 2_000, 1_000,
                30_000, "Massage Chair",
                "Sauna");
*/
        System.out.println(bm1);
        System.out.println();
        System.out.println(bm1.checkingAcct());
        System.out.println(bm1.getBalance());
        System.out.println(bm1.getAcctNum());
        System.out.println(bm1.loanAcct());
        System.out.println("Jill's last name is: " + bm1.getlName());

        //System.out.println(pm1);
        System.out.println();
       // System.out.println(em1);


    }

}
