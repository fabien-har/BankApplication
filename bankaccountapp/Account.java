package bankaccountapp;

public abstract class Account implements IBaseRate
{   //List common properties for savings and checking accounts
    private String name;
    private String sSN;
    protected  String accountNumber;
    double balance;
    protected double rate;

    private static int index = 1000;

    // Conctructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit)
    {   this.name = name ;
        this.sSN = sSN ;
        balance = initDeposit ;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber() ;
        setRate();
    }
    public abstract void setRate();

    public void compound()
    {   double accruedInterest = balance * (rate/100) ;
        balance = balance + accruedInterest ;
        System.out.println("Accrued Interest: $"+ accruedInterest) ;
        printBalance() ;
    }
    private String setAccountNumber()
    {   String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());

        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));

        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void deposit(double amount)
    {   balance = balance + amount ;
        System.out.println("Depositing $" + amount) ;
        printBalance();
    }
    public void withdraw(double amount)
    {   balance = balance - amount ;
        System.out.println("Wtihdrawing $" + amount);
        printBalance();
    }
    public void transfer(String toWhere, double amount)
    {   balance = balance - amount ;
        System.out.println("Transfering $ " + amount + " to" + toWhere) ;
        printBalance();
    }
    public void printBalance()
    {   System.out.println("Your balance is now: $"+ balance);
    }

    // List common methods
    public void showInfo()
    {   System.out.println(
            "NAME: "+ name +
                    "\nACCOUNT NUMBER: "+ accountNumber +
                    "\nBALANCE: " + balance +
                    "\nRATE: " +  rate + "%"
        ) ;
    }
}
