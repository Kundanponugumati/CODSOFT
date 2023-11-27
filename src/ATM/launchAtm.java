package ATM;

import java.util.Scanner;

public class launchAtm {
    private double balance;
     int option;
     double amount;
    Scanner sc = new Scanner(System.in);
    public void  compute()
    {
        System.out.println("What is your purpose \n 1. Cash WithDraw \n 2. Amount Deposit \n 3. Check Balance");
        option = sc.nextInt();
        if(option==1)
        {
            System.out.println("please enter the amount");
            amount = sc.nextDouble();
            boolean result = withdraw(amount);
            if(result)
            {
                System.out.println("transaction successful");
            }
            if(!result)
            {
                System.out.println("transaction is failed you don't have enough balance");
            }
            System.out.println("Continue the process (Y/N)");
            sc.nextLine(); // gets ignored
            repeat(sc.nextLine());
        }
        else if(option==2)
        {
            System.out.println("please enter the amount");
            amount = sc.nextDouble();
            boolean result = deposit(amount);
            if(result)
            {
                System.out.println("transaction successful");
            }
            System.out.println("Continue the process (Y/N)");
            sc.nextLine(); // gets ignored
            repeat(sc.nextLine());
        }
        else if(option==3)
        {
            boolean result = checkBalance();
            if(result)
            {
                System.out.println("transaction successful");
            }
            System.out.println("Continue the process (Y/N)");
            sc.nextLine(); // gets ignored
            repeat(sc.nextLine());
        }
        else
        {
            System.out.println("please enter correct number");
            repeat("Y");

        }


    }

    void repeat(String s)
    {
        if(s.equalsIgnoreCase("Y"))
        {
            compute();
        }
        else {
            System.exit(0);
        }
    }
    boolean withdraw(double amount)
    {
        if(balance<amount)
        {
            return false;
        }
        balance=balance-amount;
        System.out.println(balance);
        return true;
    }
    boolean deposit(double amount)
    {
        balance=balance+amount;
        System.out.println(balance);

        return true;
    }
    boolean checkBalance()
    {
        System.out.println(balance);
        return true;
    }
}
