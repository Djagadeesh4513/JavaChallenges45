package Coding_Exercises.SolvingProblems;

import java.util.Scanner;

public class Ex_008_FactorialOfNum_While {
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
            while(result >= 1)
            {
                ans = ans * result;
                result--;
            }
            System.out.println(ans);
        }
        else
        {
            System.out.println("Only positive values are allowed");
        }

    }
}
