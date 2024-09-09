package string_methods.touppercase;

/*
Question 5: Case Insensitivity Check

Task:
Given two strings "hello" and "HELLO", use the toUpperCase() method to check if they are equal when
converted to uppercase. Print the result.

Expected Output:

true
 */
public class QuestionFiveSolver {
    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "HELLO";
        System.out.println(word1.toUpperCase().equals(word2));
    }
}
