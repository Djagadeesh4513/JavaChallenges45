package Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TC_14_UsageOfSwitchKeyword2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Metro political city name :");
        String fav = sc.nextLine();

        switch (fav)
        {
            default :
                System.out.println("Average Cost Of Living is 25,000");
            case "Hyderabad" : System.out.println("30,000");
                  break;
            case "Bangalore" : System.out.println("45,000");
                  break;
            case "Mumbai" : System.out.println("48,000");
                  break;
            case "Delhi" : System.out.println("55,000");
                  break;
            case "Pune": System.out.println("50,000");
                  break;
            case "Chennai" : System.out.println("27,000");
                  break;
            case "Visakhapatnam" : System.out.println("20,000");
                  break;
        }

    }
}
