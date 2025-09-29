package Basics;

public class TC_17_Continue_in_Java {
    public static void main(String[] args) {

        int count = 50;
//        Monday -> Day1, Tuesday -> Day2, Wednesday -> Day3, Thursday -> 4
//          Friday -> 5, Saturday -> 6, Sunday -> 7 & so on........

        for(int d=1; d<=count;d++)
        {
            if(d%7!=0)
            {
                continue;
            }
            System.out.println("Avoid skipping food, since it is good bcz its Day :"+d);
        }

    }


}
