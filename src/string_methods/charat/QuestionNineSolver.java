package string_methods.charat;
/*
Question 9: Extracting Initials from a Name

Task:
Given a string "John Doe", use the charAt() method to extract and print the initials "J.D.".
 */

public class QuestionNineSolver {
    public static void main(String[] args) {
        String fullName = "John Doe";
        System.out.println(fullName.charAt(0) + "." + fullName.charAt(5) + ".");
    }
}
