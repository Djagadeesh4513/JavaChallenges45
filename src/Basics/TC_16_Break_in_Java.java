package Basics;

public class TC_16_Break_in_Java {
    public static void main(String[] args) {
//        break -> to stop a switch/for loop
        int no_of_panipuri = 100;
        for (int y=1;y<no_of_panipuri;y++)
        {
            if(y==1)
            {
                System.out.println("This is my " + y + "st panipuri");
            }
            else
            {
                System.out.println("This is my " + y + "th panipuri");
            }

            if (y==10)
            {
                System.out.println("Oops!!...I'm full. My Limit is completed");
                break;
            }
        }
    }
}
