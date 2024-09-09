package string_methods.tolowercase;

/*
Question 8: Case-Insensitive Substring Check

Task:
Given two strings "Hello World" and "world", use the toLowerCase() method to check if the second
string is a substring of the first string, ignoring case. Print the result.
 */
public class QuestionEightSolver {
    public static void main(String[] args) {
        String message1 = "Hello World";
        String message2 = "world";
        if (message1.toLowerCase().contains(message2)) {
            System.out.println("Yes, 'world' is a substring of 'Hello World'.");
        } else {
            System.out.println("No, 'world' is not a substring.");
        }

    }
}
