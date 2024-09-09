package string_methods.touppercase;

/*
Question 8: Case-Insensitive Substring Check

Task:
Given two strings "hello world" and "WORLD", use the toUpperCase() method to check if the second
string is a substring of the first string, ignoring case. Print the result.
 */
public class QuestionEightSolver {
    public static void main(String[] args) {
        String word1 = "hello world";
        String word2 = "WORLD";
        if (word1.toUpperCase().contains(word2))
            System.out.println("Yes, 'WORLD' is a substring of 'HELLO WORLD'.");
        else System.out.println("No, 'WORLD' is not a substring.");
    }
}
