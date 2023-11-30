package quizApplication;

import java.util.Scanner;

public class DataSet {
    Scanner sc = new Scanner(System.in);
    int marks=0;
    public int passingData()
    {
        Questions [] qarray = new Questions[5];
        qarray[0] = new Questions("1", "Size of Integer?","1 Byte","2 Byte","4 Byte","8 Byte","4 Byte","3");
        qarray[1] = new Questions("2", "Size of Float?","1 Byte","2 Byte","4 Byte","8 Byte","4 Byte","3");
        qarray[2] = new Questions("3", "Size of Double?","1 Byte","2 Byte","4 Byte","8 Byte","8 Byte","4");
        qarray[3] = new Questions("4", "Size of Character?","1 Byte","2 Byte","4 Byte","8 Byte","1 Byte","1");
        qarray[4] = new Questions("5", "Size of Short?","1 Byte","2 Byte","4 Byte","8 Byte","2 Byte","2");

        for(int i=0;i<5;i++)
        {
            int score=0;
            System.out.println("Question: "+qarray[i].getQNo());
            System.out.println(qarray[i].getQTitile());
            System.out.println(qarray[i].getOption1());
            System.out.println(qarray[i].getOption2());
            System.out.println(qarray[i].getOption3());
            System.out.println(qarray[i].getOption4());
            System.out.println("If You Want to skip the Question enter skip \n timer started");
            long start = System.currentTimeMillis();
            String ans = sc.nextLine();
            long end = System.currentTimeMillis();
            if(end-start<=10000)
            {
                if(ans.equals(qarray[i].getAnswer()) || ans.equals(qarray[i].getAnswerOption()))
                    score=score+2;
                else if(ans.equalsIgnoreCase("skip"))
                    score= score;
                else
                    score=score-1;
            }
            else
                System.out.println("Time Out");

            System.out.println("Score for this Question is: "+score);
            marks=marks+score;
        }
        return marks;
    }
}
