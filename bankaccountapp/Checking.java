package bankaccountapp;

public class Checking extends Account
{   // List properties specific to a Checking account
    private int debitCardNumber;
    private int debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit)
    {   super(name, sSN, initDeposit) ;
        accountNumber = "2" + accountNumber ;
        setDebitCard();
    }

    @Override
    public void setRate()
    {   rate = getBaseRate() *  .15 ;
    }

    private void setDebitCard()
    {   debitCardNumber = (int) (Math.random() * Math.pow(10, 12)) ;
        debitCardPIN =  (int) (Math.random() * Math.pow(10, 4)) ;
        System.out.println("CARD: " + this.debitCardNumber) ;
        System.out.println("PIN: "+ this.debitCardPIN);
    }

    // List any methods specific to the checking accounts
    public void showInfo()
    {   super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking") ;
    }



}
