package string_methods.trim;

/*
Question 6: Conditional Trimming

Task:
Given a string " Welcome to Java ", use the trim() method to remove the leading and trailing spaces.
 Then, check if the trimmed string starts with the word "Welcome" and print the result.
 */
public class QuestionSixSolver {
    public static void main(String[] args) {
        String message = " Welcome to Java ";
        String trimmed = message.trim();
        if (trimmed.startsWith("Welcome")) {
            System.out.println("Yes, it does start with 'Welcome'.");
        } else {
            System.out.println("Doesn't start with 'Welcome'.");
        }

    }
}
