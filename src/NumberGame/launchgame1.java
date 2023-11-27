package NumberGame;

import java.util.Random;
import java.util.Scanner;

public class launchgame1 {
    static int score=0;
    static int chance=0;
    static int finalScore = 0;
    String userName;
    Scanner sc = new Scanner(System.in);
    public String startNumberGame(String userName,String interest)
    {
        this.userName=userName;
        System.out.println(userName + " You only have 10 Chances to guess the number");
        System.out.println(userName+" Please Select the range which you would like to play");
        System.out.println("Lower Limit");
        int lowerLimit = sc.nextInt();
        System.out.println("Upper Limit");
        int upperLimit = sc.nextInt();
        // Generating random number
        Random random = new Random();
        int randomNumber = random.nextInt((upperLimit - lowerLimit) + 1) + lowerLimit;
//        System.out.println(randomNumber);
        int guessingNumber=0;
        int count=1;
        System.out.println("Please Guess the number");
        // while loop runs as long as the user guesses correct number and
        // no.of chances user take to guess correct number is less than or equal to 10.
        while( count<=10 && guessingNumber!=randomNumber)
        {
            guessingNumber=sc.nextInt();
            if(guessingNumber>randomNumber)
            {
                System.out.println("too high");
                count++;
            }
            if(guessingNumber<randomNumber)
            {
                System.out.println("too low");
                count++;
            }
        }
        // if count>10 then it comes out of loop then
        if(count>10)
        {
            count=10;
            // to calculate win percentage we make count to 10 so that win percentage
            // becomes 0 we can't make win percentage to negative right?
        }
        sc.nextLine();// this line gets Ignored.
        chance++;
         int eachGameScore = (10-count)*10 ;
        System.out.println("no.of chances taken: "+count);
        System.out.println("Your Win% is: "+eachGameScore);
         score = score+eachGameScore;
        System.out.println(userName+" ThankYou for Playing the Game");
        System.out.println("would you like to play one more (Y/N)");
         interest=sc.nextLine();
        if(interest.equalsIgnoreCase("N"))
        {
            finalScore = score/chance;
        System.out.println("Your Score is "+finalScore);
        }
        return interest;
    }
}
