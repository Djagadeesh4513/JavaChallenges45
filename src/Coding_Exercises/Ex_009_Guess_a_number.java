package Coding_Exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex_009_Guess_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random num = new Random();
        int univ_num = num.nextInt(151);
        int loop = 0;
        System.out.println("Enter an Integer value between 0 to 150");
        while(true)
        {
            if(scn.hasNextInt())
            {
                int guess_num = scn.nextInt();
                loop++;
                if (guess_num>univ_num)
                {
                    System.out.println("The Number you chosen is bigger than the original number");
                }
                if (guess_num<univ_num)
                {
                    System.out.println("The Number you have chosen is smaller than the original number");
                }
                if (guess_num==univ_num)
                {
                    System.out.println("Great..! The Number you have chosen is correct. You have taken "+loop+" attempts to guess the original number");
                    break;
                }

            }
            else
            {
                System.out.println("Only integers between 0 and 150 are allowed");
                break;
            }
        }


    }
}
