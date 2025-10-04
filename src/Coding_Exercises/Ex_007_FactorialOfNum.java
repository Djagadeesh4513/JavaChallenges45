package Coding_Exercises;

import java.util.Scanner;

public class Ex_007_FactorialOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if(!in.hasNextInt())
        {
            System.out.println("Only Integer values are allowed");
        }

        int result = in.nextInt();
        int ans=1;

        if(result==0)
        {
            System.out.println(1);
            return;
        }

        if (result>0)
        {
            for (int i = result; i >= 1; i--)
            {
                ans = ans * i;
            }
            System.out.println(ans);
        }
        else
        {
            System.out.println("Only positive values are allowed");
        }
    }
}
