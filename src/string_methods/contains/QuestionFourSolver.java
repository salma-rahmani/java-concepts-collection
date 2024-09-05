package string_methods.contains;

/*
Question 4: Checking for a Sequence of Characters

Task:
Given a string "Learning Java is fun", use the contains() method to check if it contains the substring "Java is". Print the result.

Expected Output:

true
 */
public class QuestionFourSolver {
    public static void main(String[] args) {
        String message = "Learning Java is fun";
        System.out.println(message.contains("Java is"));
    }
}
