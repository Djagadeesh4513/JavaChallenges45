package Coding_Exercises.SolvingProblems;
//      This code only works if the given input strings has no repeated characters
import java.util.Scanner;

public class Ex_026_String_Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String1");
        String name = scanner.next();
        name = name.toLowerCase();

        System.out.println("Enter String2");
        String place = scanner.next();
        place = place.toLowerCase();

        int flag =0;
        if(name.length()==place.length())
        {
            for (int i=0;i<=name.length()-1;i++)
            {
                for(int j=0;j<=place.length()-1;j++)
                {
                    if(name.charAt(i)==place.charAt(j))
                    {
                        flag++;
                    }
                }
            }
            if (flag==name.length() && flag==place.length())
            {
                System.out.println("Its a Anagram");
            }
            else
            {
                System.out.println("Not a Anagram");
            }
        }
        else
        {
            System.out.println("Not a Anagram");
        }
    }
}
