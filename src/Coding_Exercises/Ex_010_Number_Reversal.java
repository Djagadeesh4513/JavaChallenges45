package Coding_Exercises;
import java.util.Scanner;

public class Ex_010_Number_Reversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //4716
        //Step 1:- 4716%10 = 6
        //Step 2:- 471%10 = 1
        //Step 3:- 47%10 = 7
        //Step 4:- 4%10 = 4
        System.out.println("Enter a positive Integer number");

        if(!sc.hasNextInt())
        {
            System.out.println("Only +ve Integer values are allowed");
        }
        int k = sc.nextInt();
        int ans=0;

//        while(k>0)
//        {
//            ans = ans*10 + k%10;
//            k=k/10;
//        }

        for(;k>0;k/=10)
        {
            ans = ans*10 + k%10;
        }

        System.out.println("Reversal of the Input number: "+ans);
    }
}
