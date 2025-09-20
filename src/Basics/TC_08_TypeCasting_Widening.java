package Basics;

public class TC_08_TypeCasting_Widening {
    public static void main(String[] args) {
        //Converting smaller data type to a larger data type - Widening

        short s = 300;
//        int i = s; --> Implicit casting

          int i = (int)s; // Explicit casting
        System.out.println(i);
    }
}
