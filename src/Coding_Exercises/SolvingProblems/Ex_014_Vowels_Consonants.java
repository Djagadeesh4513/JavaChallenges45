package Coding_Exercises.SolvingProblems;
public class Ex_014_Vowels_Consonants {
    public static void main(String[] args) {
        String sss = "Interview Questions";
        int vow = 0;
        int con = 0;
        for(int i=1;i<=sss.length();i++)
        {
            char c = sss.charAt(i-1);
            if (c==65||c==69||c==73||c==79||c==85||c==97||c==101||c==105||c==111||c==117)
            {
                vow++;
            }
            else
            {
                con++;
            }
        }
        System.out.println("No. of vowels = "+vow);
        System.out.println("No. of consonants = "+con);
    }
}