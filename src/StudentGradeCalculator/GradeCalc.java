package StudentGradeCalculator;

import java.util.Scanner;

public class GradeCalc {
    String userName;
    Scanner sc = new Scanner(System.in);
    public GradeCalc(String userName)
    {
        this.userName=userName;
    }

    public void enterMarks() {
        System.out.println(userName+" Enter no.of subjects you have in the Semester");
        int noOfSubjects = sc.nextInt();
        System.out.println("Enter marks of each Subject");
        int [] marksArr = new int[noOfSubjects];
        for(int i = 0; i<noOfSubjects; i++)
        {
            System.out.println("Subject-"+(i+1));
            marksArr[i] = sc.nextInt();
        }
        int totalMarks=0;
        for(int marks :marksArr)
        {
            totalMarks=totalMarks+marks;
        }
        System.out.println(userName+"'s Total Marks: "+totalMarks);
        double avgMark = (double) totalMarks /noOfSubjects;
        System.out.println("Average percentage of "+userName+" is: "+avgMark);

        if(avgMark>90)
        {
            System.out.println(userName+ " your Grade for This Semester is: S");
        }
        else if(avgMark<90 && avgMark>=80)
        {
            System.out.println(userName+ " your Grade for This Semester is: A");
        }
        else if(avgMark<80 && avgMark>=70)
        {
            System.out.println(userName+ " your Grade for This Semester is: B");
        }
        else if(avgMark<70 && avgMark>=60)
        {
            System.out.println(userName+ " your Grade for This Semester is: C");
        }
        else if(avgMark<60 && avgMark>=55)
        {
            System.out.println(userName+ " your Grade for This Semester is: D");
        }
        else if(avgMark<55 && avgMark>=50)
        {
            System.out.println(userName+ " your Grade for This Semester is: E");
        }
        else
        {
            System.out.println(userName+" you have failed in the semester");
        }
    }
}
