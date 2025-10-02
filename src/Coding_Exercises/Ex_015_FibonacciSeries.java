package Coding_Exercises;
import java.util.Scanner;

public class Ex_015_FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number in the Fibonacci series...");

        if(!input.hasNextInt())
        {
            System.out.println("Only +ve Integer values are allowed");
        }

        int ab = input.nextInt();
        System.out.println("Enter the second number in the Fibonacci series...");
        int bc = input.nextInt();
        System.out.println("Enter no. of values u want to print");
        int cnt = input.nextInt();

        int sum = 0;
        System.out.println(ab);
        System.out.println(bc);
        for(int i=1;i<=cnt-2;i++)
        {
            sum = ab + bc;
            ab = bc;
            bc = sum;

            System.out.println(sum);
        }

    }
}
