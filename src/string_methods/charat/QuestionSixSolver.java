package string_methods.charat;
/*
Question 6: Finding the Middle Character

Task:
Given a string "Coding", use the charAt() method to find and print the middle character.
Assume the string length is odd.
 */
public class QuestionSixSolver {
    public static void main(String[] args) {
        String field = "Coding";
        System.out.println(field.charAt((field.length()-1) /2));
    }
}
