package Coding_Exercises.StarPatterns;

import java.util.Scanner;

public class Ex_026_Inverted_PyramidPattern {
    public static void main(String[] args) {
        Scanner dj = new Scanner(System.in);
        int max = dj.nextInt();

        for(int i=max;i>=1;i--)
        {
            for(int j=i;j<max;j++)
            {
                System.out.print(" ");
            }

            for (int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
