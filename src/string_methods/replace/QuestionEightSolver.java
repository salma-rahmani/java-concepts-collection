package string_methods.replace;

/*
Question 8: Replacing Specific Characters

Task:
Given a string "password123", replace all digits in the string with the character "*".
 Use the replace() method creatively to achieve this. Print the final result.
 */
public class QuestionEightSolver {
    public static void main(String[] args) {
        String password = "password123";
        System.out.println(password.replaceAll("[0-9]", "*"));
    }
}
