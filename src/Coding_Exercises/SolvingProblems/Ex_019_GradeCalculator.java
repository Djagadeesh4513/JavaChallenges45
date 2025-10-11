package Coding_Exercises.SolvingProblems;

import java.util.Scanner;

public class Ex_019_GradeCalculator {
    public static void main(String[] args) {
        Scanner anr = new Scanner(System.in);
        System.out.println("Enter the Total marks you have Obtained in Final Exam");
        if(!anr.hasNextInt())
        {
            System.out.println("Only +ve Integer values are allowed");
        }
        int marks = anr.nextInt();

        if (marks>=90 && marks<=100)
        {
            System.out.println("A");
        }
        else if (marks>=80 && marks<90)
        {
            System.out.println("B");
        }
        else if (marks>=70 && marks<80)
        {
            System.out.println("C");
        }
        else if (marks>=60 && marks<70)
        {
            System.out.println("D");
        }
        else if (marks>=0)
        {
            System.out.println("F");
        }
        else
        {
            System.out.println("Zero is the min Marks a person can obtain. Please enter Valid Marks..!");
        }

    }
}
