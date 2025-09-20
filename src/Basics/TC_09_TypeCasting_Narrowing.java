package Basics;

public class TC_09_TypeCasting_Narrowing {
    public static void main(String[] args) {
        //Converting larger data types to smaller data types - Narrowing

        int i = 264; // Binary format of 264 is 0000000100001000

//      short s = i; Implicit casting is not allowed in Narrowing TYpe Casting

        byte b = (byte)i;

        System.out.println(b);
    }
}
