package bankaccountapp;

public class Savings extends Account
{   private double safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit)
    {   super(name, sSN, initDeposit) ;
        accountNumber = "1" + accountNumber ;
        setSafetyDepositBox() ;
    }
    private void setSafetyDepositBox()
    {   safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3)) ;
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 4)) ;
    }

    // List  any methods specific to savings account
    public void showInfo()
    {   super.showInfo() ;
        System.out.println(
                " Your Savings Account Features" +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n Safety Deposit Box key: " + safetyDepositBoxKey
        );
    }
    @Override
    public void setRate()
    {   rate = getBaseRate() - .25 ;
    }
}
