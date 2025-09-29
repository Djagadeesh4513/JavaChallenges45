package Coding_Exercises;

import java.util.Scanner;

public class Ex_011_String_Palindrome {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String word = scr.nextLine();
        int length = word.length()-1;
        String empty = "";
        while(length>=0)
        {
            empty = empty + word.charAt(length);
            length--;
        }
        if(word.equals(empty))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
