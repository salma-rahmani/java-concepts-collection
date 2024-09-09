package string_methods.touppercase;

/*
Question 6: Case Conversion and Replacement

Task:
Given a string "text and more text", use the toUpperCase() method and replace() method together
to convert the string to uppercase and then replace all occurrences of "TEXT" with "DATA".
Print the final result.
 */
public class QuestionSixSolver {
    public static void main(String[] args) {
        String message = "text and more text";
        System.out.println(message.toUpperCase().replaceAll("TEXT", "DATA"));
    }
}
