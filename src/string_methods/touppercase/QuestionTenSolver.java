package string_methods.touppercase;

/*
Question 10: Complex Case Manipulation

Task:
Given a string "AbCdEfGhIj", convert the string to uppercase. Then, replace every fourth
character in the string with "*". Print the final result.
 */
public class QuestionTenSolver {
    public static void main(String[] args) {
        String message = "AbCdEfGhIj";
        String upperMessage = message.toUpperCase();
        StringBuilder result = new StringBuilder(upperMessage);

        for (int i = 3; i < upperMessage.length(); i += 4) {
            result.setCharAt(i, '*'); // Replace every fourth character with '*'
        }

        System.out.println(result.toString());
    }
}
