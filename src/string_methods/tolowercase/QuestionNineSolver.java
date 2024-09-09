package string_methods.tolowercase;

/*
Question 9: Dynamic Case Conversion

Task:
Given a string "Toggle CASE", write logic that converts the string to lowercase only if
it contains any uppercase letters. If the string is already in lowercase, print "No conversion needed".
Print the final result.
 */
public class QuestionNineSolver {
    public static void main(String[] args) {
        String title = "Toggle CASE";
         // To check if a string contains any uppercase character, we should use a regular expression like ".*[A-Z].*".
        // If we only want to match the entire string as an uppercase letter, we can use "[A-Z]".

        if (title.matches(".*[A-Z].*")) {
            System.out.println(title.toLowerCase());
        } else {
            System.out.println("No Conversion needed");
        }

    }
}
