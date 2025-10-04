package Coding_Exercises;
// Write a program that prints numbers from 1 to 100.
// However, for multiples of 3, print "Fizz" instead of the number,
// and for multiples of 5, print "Buzz."
// For numbers that are multiples of both 3 and 5, print "FizzBuzz."

import java.util.Scanner;

public class Ex_018_FizzBuzzTest {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        if(!scr.hasNextInt())
        {
            System.out.println("Only +ve Integers are allowed");
        }
        int limit = scr.nextInt();
        for (int i=1;i<=limit;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("Number: "+i + " -FizzBuzz");
            }
            else if (i%3==0 || i%5==0)
            {
                if (i % 3 == 0)
                {
                    System.out.println("Number: "+i + " -Fizz");
                }
                if (i % 5 == 0)
                {
                    System.out.println("Number: "+i + " -Buzz");
                }
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
