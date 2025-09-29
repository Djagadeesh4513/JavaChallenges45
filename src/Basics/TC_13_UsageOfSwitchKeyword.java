package Basics;

import java.util.Scanner;

public class TC_13_UsageOfSwitchKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any popular Indian cricketer's Jersey number");
        int fav = sc.nextInt();

        switch (fav)
        {
            case 7 : System.out.println("CAPTAIN COOL");
                //break;
            case 10 : System.out.println("MASTER BLASTER");
                //break;
            case 18 : System.out.println("KING");
                break;
            case 45 : System.out.println("HITMAN");
                break;
            default:
                System.out.println("Sorry! Can u try some other number");

        }

    }
}
