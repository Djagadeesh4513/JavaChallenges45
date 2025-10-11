package Basics;

import java.util.Scanner;

public class TC_21_Userdefinedfunc {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(sum_of_2_nums(x,y));
    }
    static int sum_of_2_nums(int a,int b)
    {
        return a+b;
    }
}
