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

import java.util.Scanner;

class Account
{
    private String fName, lName, customerID;
    private int previousTransaction;
    protected long balance;

    public Account(String fName, String lName, String userID,
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

    //method calculating interest of current funds after a number of years
    void calculateInterest(int years)
    {
        double interestRate = .019;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is: " + (100 * interestRate) +"%");
        System.out.println("After "+ years + " years, your balance will be: " + newBalance);

    }

    void showMenu()
    {
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, " + fName+ " "+lName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do today?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");

        do //runs at least once, allowing user to enter an option
        {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = sc.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch (option)
            {
                //case 'A' is where user can check their balance
                case 'A':
                    System.out.println("=====================");
                    System.out.println("Balance = $"+ balance);
                    System.out.println("=====================");
                    System.out.println();
                    break;

                // case 'B' is where the user can enter a deposit amount
                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;

                    //user can view their most recent transaction
                case 'D':
                    System.out.println("=====================");
                    getPreviousTransaction();
                    System.out.println("=====================");
                    System.out.println();
                    break;

                    //calculates the interest accrued after a number of years
                case 'E':
                    System.out.println("Enter how many years of interest accrued: ");
                    int years = sc.nextInt();
                    calculateInterest(years);
                    break;

                    //user exits out of the account
                case 'F':
                    System.out.println("======================");
                    break;

                default:
                    break;

            }
        } while(option != 'F');
        System.out.println("Thank you banking with us!");

    }


}

public class Main
{
    public static void main(String[]args)
    {

        Account ac1 = new Account("Jyll", "Roddy", "JR36581", 50);
        ac1.showMenu();


    }

}
