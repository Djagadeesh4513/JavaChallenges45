package Coding_Exercises.StarPatterns;

import java.util.Scanner;

public class Ex_024_InvertedRightSided_RightAngleTriangle_StarPattern {
    public static void main(String[] args) {
        Scanner ind = new Scanner(System.in);
        int number = ind.nextInt();

        for (int i=0;i<number;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }

            for(int j=number;j>i;j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
