package Coding_Exercises;

import java.util.Scanner;

public class Ex_021_LeftTriangleStarPattern {
    public static void main(String[] args) {
        Scanner lu = new Scanner(System.in);
       
        if(!lu.hasNextInt())
        {
            System.out.println("Only +ve values are allowed");
        }
        int times = lu.nextInt();
        for(int d=times;d>=1;d--)
        {
            for(int n=1;n<=d;n++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
