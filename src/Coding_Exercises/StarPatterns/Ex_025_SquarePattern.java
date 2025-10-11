package Coding_Exercises.StarPatterns;

import java.util.Scanner;

public class Ex_025_SquarePattern {
    public static void main(String[] args) {
        Scanner bcci = new Scanner(System.in);
        System.out.println("Enter a +ve Integer number");
        if(!bcci.hasNextInt())
        {
            System.out.println("Only +ve Integer values are allowed");
        }
        int no = bcci.nextInt();

        for(int i=1;i<=no;i++)
        {
            if(i==1 || i==no)
            {
                for(int j=1;j<=no;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int j=1;j<=no;j++)
                {
                    if(j==1 ||j==no)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
