package string_methods.touppercase;

/*
Question 9: Dynamic Case Conversion

Task:
Given a string "toggle case", write logic that converts the string to uppercase only
if it contains any lowercase letters. If the string is already in uppercase, print
"No conversion needed". Print the final result.
 */
public class QuestionNineSolver {
    public static void main(String[] args) {
        String message = "toggle case";

        if (message.matches(".*[a-z].*")) {
            System.out.println(message.toUpperCase());
        } else {
            System.out.println("No conversion needed");
        }

    }
}
