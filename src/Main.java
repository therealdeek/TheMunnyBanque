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
    private String fName, lName, customerID;
    private int previousTransaction;
    protected long balance;

    public acctInfo(String fName, String lName, String userID,
                    long initialBalance)
    {
        this.fName = fName;
        this.lName = lName;
        this.customerID = userID;
        this.balance = initialBalance;

    }

    // method for user to deposit their money
    void deposit(int amount)
    {
        if(amount != 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    //method for user to withdraw their money
    void withdraw(int amount)
    {
        if(amount != 0)
        {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    // user's transaction will be tracked
    void getPreviousTransaction()
    {
        if(previousTransaction > 0)
        {
            System.out.println(fName + " deposited: "+ previousTransaction);
        }
        else if(previousTransaction < 0)
        {
            System.out.println(fName + " withdrew: " + Math.abs(previousTransaction));
        }
    }

}

public class Main
{
    public static void main(String[]args)
    {



    }

}
