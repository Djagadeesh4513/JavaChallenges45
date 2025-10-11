package Coding_Exercises.SolvingProblems;

public class Ex_002_MaxOf3NumTernary {
    public static void main(String[] args) {
        int x = 917;
        int y = 797;
        int z = 1080;

        int result = (x>y)?(x>z?x:z):(y>z?y:z);

        System.out.println(result);
    }
}
