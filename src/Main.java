import NumberGame.launchgame1;

import java.util.Scanner;

public class Main {
    static String userName;
    public static void main(String[] args)
    {
        System.out.println("Welcome to This Console Based Project");
        System.out.println("Please Enter Your Name");
        Scanner sc = new Scanner(System.in);
          userName=sc.nextLine();
        System.out.println(userName+" which one would like to pickup");
        System.out.println("1. Number Game");
        System.out.println("2 Student Grade Calculator");
        System.out.println("3 ATM Interface");
        System.out.println("4 Quiz Application With Timer");
        System.out.println("5 Student Course Registration System");
        System.out.println("Please Select from Above");
        int choice = sc.nextInt();
        if(choice==1)
        {
            System.out.println(userName+" Welcome to Number Game.");
            String interest="Y";
            while(interest.equalsIgnoreCase("Y"))
            {
                launchgame1 game1 = new launchgame1();
                interest = game1.startNumberGame(userName,interest);
            }
        }
        else if(choice==2)
        {

        }
        else if(choice==3)
        {

        }
        else if(choice==4)
        {

        }
        else if(choice==5)
        {

        }
        else
        {
            System.out.println("Please Choose Correctly");
        }
        System.out.println("ThankYou");
        System.out.println("Kundan Sai Ponugumati");
        System.exit(0);
    }
}