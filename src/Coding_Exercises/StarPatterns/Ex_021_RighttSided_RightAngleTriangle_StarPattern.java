package Coding_Exercises.StarPatterns;

import java.util.Scanner;

public class Ex_021_RighttSided_RightAngleTriangle_StarPattern {
    public static void main(String[] args) {
        Scanner icc = new Scanner(System.in);
        int number = icc.nextInt();

        for (int i=0;i<number;i++)
        {
            for(int j=number-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=number-i;k<=number;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
