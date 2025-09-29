package Coding_Exercises;

import java.util.Scanner;

public class Ex_006_ClassifyTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side 1: ");
        String s1 = sc.next();
        System.out.println("Enter Side 2: ");
        String s2 = sc.next();
        System.out.println("Enter Side 3: ");
        String s3 = sc.next();


        if (Integer.parseInt(s1)>0 && Integer.parseInt(s2)>0 && Integer.parseInt(s3)>0)
        {

            if (s1.equals(s2) && s1.equals(s3)) {
                System.out.println("Equilateral triangle");
            } else if (s1.equals(s2) || s2.equals(s3) || s3.equals(s1)) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        }
        else
        {
            System.out.println("The side(s) of a triangle can never be zero");
        }

    }
}
