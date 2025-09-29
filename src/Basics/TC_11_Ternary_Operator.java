package Basics;

public class TC_11_Ternary_Operator {
    public static void main(String[] args) {
        int ap = 55;
        int ts = 45;
        int max_value2 = ap>ts ? ap : ts;

//      System.out.println(max_value2);
        int mh = 75;
        int if_max_value3 ;

        if(ap>ts)
        {
            if (mh>ap)
            {
                if_max_value3 = mh;
            }
            else
            {
                if_max_value3 = ap;
            }
        }
        else
        {
            if(mh>ts)
            {
                if_max_value3 = mh;
            }
            else
            {
                if_max_value3 = ts;
            }
        }

        System.out.println(if_max_value3);

        int max_value3 = (ap>ts)? (ap>mh ? ap : mh) : (mh>ts ? mh : ts);
        System.out.println(max_value3);
    }
}