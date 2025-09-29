package Basics;

public class TC_18_WhileLoop {
    public static void main(String[] args) {
        int age = 16;
        int count = 0;
        while(true)
        {
            if(age==25)
            {
                System.out.println("You have exceeded the no. of max. no. of attempts");
                break;
            }
            System.out.println("Age :-"+age+", You haven't cleared the public exam, please try next year");
            age++;
        }
    }
}
