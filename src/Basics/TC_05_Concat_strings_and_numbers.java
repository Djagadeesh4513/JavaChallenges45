package Basics;

public class TC_05_Concat_strings_and_numbers {
    public static void main(String[] args) {


        int a = 15;
        int b = 10;
        String s1 = "FirstName";
        String s2 = "LastName";

        System.out.println(s1 + s2 + a + b);
        System.out.println(a + b + s1 + s2 + a + b);
        System.out.println(s1 + s2 + a + b + s1 + s2);
        System.out.println(a + b + s1 + s2 + (a + b));

    }
}