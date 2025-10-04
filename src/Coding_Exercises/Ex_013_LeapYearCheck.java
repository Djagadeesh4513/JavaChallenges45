package Coding_Exercises;

import java.util.Scanner;

public class Ex_013_LeapYearCheck {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        if(!sca.hasNextInt())
        {
            System.out.println("Only +ve Integers values are allowed");
        }

        boolean flag = false;
        int year = sca.nextInt();

        if(year%4==0)
        {
            flag = true;
            if(year%100==0)//to check if it is a Century year
            {
                if(year%400==0)
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                }
            }
        }
        else
        {
            flag = false;
        }
        if (flag)
        {
            System.out.println("Its a leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}
