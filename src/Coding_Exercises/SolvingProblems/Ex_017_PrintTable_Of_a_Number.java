package Coding_Exercises.SolvingProblems;

import java.util.Scanner;

public class Ex_017_PrintTable_Of_a_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt())
        {
            System.out.println("Only +ve Integer values are allowed");
        }
        int table_num = sc.nextInt();
        for (int i=1;i<=20;i++)
        {
            System.out.printf("%d * %d = %d\n",table_num,i,table_num*i);
        }

    }
}
