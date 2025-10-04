package Coding_Exercises;

import java.util.Scanner;
public class Ex_022_PyramidPattern {
    public static void main(String[] args) {
        Scanner scx = new Scanner(System.in);
        System.out.println("Enter no. of rows you want to print a Pyramid triangle");
        int test = scx.nextInt();

        for (int r=1;r<=test;r++)
        {
            for(int s=1;s<=test-r;s++)
            {
                System.out.print(" ");
            }
            for(int c=1;c<=((r*2)-1);c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}