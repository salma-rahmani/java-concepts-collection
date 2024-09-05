package string_methods.charat;
/*
Question 2: Accessing the Last Character

Task:
Given a string "Java", use the charAt() method to access and print the last character of the string.

Expected Output:

a
 */

public class QuestionTwoSolver {
    public static void main(String[] args) {
        String text = "Java";
        // there is two ways that we can get the last character of Java string.
        System.out.println(text.charAt(text.length()-1));
        System.out.println(text.charAt(3));
    }
}
