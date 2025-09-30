package Coding_Exercises;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex_012_Prime_Number {
    public static void main(String[] args) {
        Scanner somu = new Scanner(System.in);
        if(!somu.hasNextInt())
        {
            System.out.println("Only +ve Integer values are allowed");
        }
        int isPrimeOrNot = somu.nextInt();
        int factors = 0;
        if(isPrimeOrNot==0 || isPrimeOrNot ==1)
        {
            System.out.println("0 and 1 aren't considered as a Prime numbers");
        }

        if(isPrimeOrNot==2)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            for(int i=1;i<=isPrimeOrNot/2;i++)
            {
                if(isPrimeOrNot%i==0)
                {
                    factors++;
                    if (factors >=2)
                    {
                        break;
                    }
                }
            }
        }

        if (factors>=2)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            System.out.println("Prime number");
        }
    }
}
