package Coding_Exercises;

import java.util.Scanner;

public class Ex_020_RightTriangleStarPattern {
    public static void main(String[] args) {
        Scanner lu = new Scanner(System.in);

        if(!lu.hasNextInt())
        {
            System.out.println("Only +ve values are allowed");
        }
        int times = lu.nextInt();
        for(int d=1;d<=times;d++)
        {
            for(int n=1;n<=d;n++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
