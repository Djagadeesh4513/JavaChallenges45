package Basics;

public class TC_20_Functions {
    public static void main(String[] args)
    {
        System.out.println(f1(13));

        System.out.println(f2());

        f3(40000);

        f4();

    }

//    1.With return type & With Parameters
        public static String f1 (int abc)
        {
            return "Lucky Number: "+abc;
        }

//    2.With return type & Without Parameters
        public static String f2()
        {
            return "This is DJ";
        }

//    3.Without return type & With Parameters
         public static void f3 (double money)
        {
            System.out.println(money);
        }

//    4.Without return type & Without Parameters
        public static void f4()
        {
            System.out.println("Please do hard work");
        }
}
