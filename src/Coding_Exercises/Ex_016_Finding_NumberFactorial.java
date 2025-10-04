package Coding_Exercises;

import java.util.Scanner;

public class Ex_016_Finding_NumberFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(!sc.hasNextInt())
        {
            System.out.println("Only +ve Integer values are allowed");
        }
        int dzire = sc.nextInt();
        int value = 1;
        int key = 1;
        while(value<dzire)
        {
            value = value*key;
            key++;
            if(dzire==value)
            {
                System.out.println(key-1);
                return;
            }
        }
        System.out.println("This number was't a factorial of a number");
    }
}
