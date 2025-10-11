package Coding_Exercises.StarPatterns;

import java.util.Scanner;

public class Ex_023_InvertedLeftSided_RightAngleTriangle_StarPattern {
    public static void main(String[] args) {
        Scanner lu = new Scanner(System.in);
       
        if(!lu.hasNextInt())
        {
            System.out.println("Only +ve values are allowed");
        }
        int times = lu.nextInt();
        for(int i=times;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
