package Basics;

public class TC_10_Casting_ArithmeticOperations {
    public static void main(String[] args) {
        int i = 4999;
        float tax = 899.92f;

        int price = i + (int)tax;
        System.out.println(price);

        float precise_price = i + tax;
        System.out.println(precise_price);
    }
}
