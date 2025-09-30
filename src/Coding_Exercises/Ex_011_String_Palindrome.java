package Coding_Exercises;
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
        String empty = "";

        while(length>=0)
        {
            empty = empty + notes.charAt(length);
            length--;
        }
        if(notes.equals(empty))
        {
            System.out.println("Its a Palindrome string");
        }
        else
        {
            System.out.println("It is not a Palindrome string");
        }
    }
}
