package Coding_Exercises.SolvingProblems;
import java.util.Scanner;

public class Ex_011_String_Palindrome {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a String");

        if(!scr.hasNext())
        {
            System.out.println("Only string values are allowed");
        }
        String notes = scr.nextLine();
        int length = notes.length()-1;
        String palin = "";

        while(length>=0)
        {
            palin = palin + notes.charAt(length);
            length--;
        }
        if(notes.equals(palin))
        {
            System.out.println("Its a Palindrome string");
        }
        else
        {
            System.out.println("It is not a Palindrome string");
        }
    }
}
