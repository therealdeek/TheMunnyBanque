import java.util.*;
import java.util.Scanner;

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
                    int acctNum, int phoneNum)
    {
        this.fName = fName;
        this.lName = lName;
        this.emailAddress = emailAddress;
        this.acctNum = acctNum;
        this.phoneNum = phoneNum;
        balance = 0;

    }

    public void setfName(String fName) {this.fName = fName;}

    public String getfName() {return fName;}

    public void setlName(String lName) {this.lName = lName;}

    public String getlName() {return lName;}

    public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}

    public String getEmailAddress() {return emailAddress;}

    public void setAcctNum(int acctNum) {this.acctNum = acctNum;}

    public int getAcctNum() {return acctNum;}

    public void setPhoneNum(int phoneNum) {this.phoneNum = phoneNum;}

    public int getPhoneNum() {return phoneNum;}

    public long getBalance() {return balance;}

    @Override
    public String toString()
    {
        return lName+", "+ fName + " | "+ emailAddress+ " | "+ balance;
    }

}

class checkingAcct
{
    public void deposit(long amount)
    {
        balance += amount;
    }

    public void withdraw(long amount)
    {
        balance -= amount;
    }
}

class loanAcct
{
    public void payEMI(long amount)
    {
        balance -= amount;
    }

    public void repay(long amount)
    {
        if(balance == amount)
        {
            balance = 0;
        }
    }

}

public class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);



    }

}
