package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp
{   public static void main(String[] args)
    {
        List<Account> accounts = new LinkedList<>() ;

        String file = "E:\\\\projets\\\\java\\\\BankAccount\\\\NewBankAccount.csv.txt" ;

        /*
        Checking chacc1 = new Checking("Fabien MAMY HARIJAONA", "32145678", 1500);
        Savings savacc1 = new Savings("Rich Love", "44789453", 2500);

        savacc1.showInfo() ;

        System.out.println("********************") ;
        chacc1.showInfo() ;

        savacc1.deposit(5000);
        savacc1.withdraw(200);
        savacc1.transfer("Brokerage", 3000);

        savacc1.compound();

        */
        //Read a CSV File then create new accounts based on the data
        List<String[]> newAccountHolder = utilities.CSV.read(file) ;

        for (String[] accountHolder : newAccountHolder)
        {   System.out.println("NEW ACCOUNT");

            String name = accountHolder[0] ;
            String sSN = accountHolder[1] ;
            String accountType = accountHolder[2] ;
            double initDeposit = Double.parseDouble(accountHolder[3]) ;

            System.out.println(name + " " + sSN + " "+ accountType + " " + initDeposit);

            if (accountType.equals("Savings"))
            {   accounts.add(new Savings(name, sSN, initDeposit)) ;
            }

            else if  (accountType.equals("Checings"))
            {   accounts.add(new Checking(name, sSN, initDeposit)) ;
            }

            else
            {   System.out.println("ERROR READING ACCOUNT");
            }

            for(Account acc : accounts)
            {   System.out.println("**********************************");
                acc.showInfo();
            }

        }
    }
}
