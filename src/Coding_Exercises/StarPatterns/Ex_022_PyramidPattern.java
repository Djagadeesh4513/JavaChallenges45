package Coding_Exercises.StarPatterns;

import java.util.Scanner;
public class Ex_022_PyramidPattern {
    public static void main(String[] args) {
        Scanner scx = new Scanner(System.in);
        System.out.println("Enter no. of rows you want to print a Pyramid triangle");
        int test = scx.nextInt();

        for (int i=1;i<=test;i++)
        {
            for(int j=1;j<=test-i;j++)
            {
                System.out.print("-");
            }

            for(int k=1;k<=((i*2)-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}