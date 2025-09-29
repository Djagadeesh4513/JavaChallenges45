package Coding_Exercises;

public class Ex_004_IncrementOperators {
    public static void main(String[] args) {
        int inc = 29;

        int b = inc++;//b=29 | inc=30
        System.out.println(b);//b=29
        System.out.println(++inc);//inc=31
        System.out.println(inc++);//inc=31 | inc=32
        System.out.println(inc);//inc=32
    }
}
