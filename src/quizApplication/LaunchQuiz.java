package quizApplication;

import java.util.Scanner;

public class LaunchQuiz {
    public void compute() {
        System.out.println("Welcome to Console Based Quiz Application");
        System.out.println("Please Enter Your Name");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println(userName + ", Please Note that this quiz is timer based i.e you get 10 Seconds to answer each Question. You Can Answer after that but the Answer is not considered.");
        System.out.println("The Rules are +2 for each correct answer -1 for each wrong answer and 0 if you skip or if you answered after time limit.");
        System.out.println("Ready to start the Quiz (Y/N)");
        String choice = sc.nextLine();
        DataSet d = new DataSet();
        if(choice.equalsIgnoreCase("Y"))
        {
            int marks = d.passingData();
            System.out.println(userName+" you scored "+marks+" out of 10.");
        }
    }
}
