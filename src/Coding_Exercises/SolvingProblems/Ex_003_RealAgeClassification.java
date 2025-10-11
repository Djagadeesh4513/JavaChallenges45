package Coding_Exercises.SolvingProblems;

public class Ex_003_RealAgeClassification {
    public static void main(String[] args) {
        int age = 65;

        String ageclass = age>=18 ? (age>=65? "Sr. Citizen":"Major") : "Minor";

        System.out.println(ageclass);
    }
}
