package string_methods.length;

import java.util.Scanner;

/*
Question 5: Analyzing Length of User Input

Task:
Ask the user to input any string (you can assume a predefined string for this
assignment, e.g., "OpenAI"). Use the length() method to determine the length of
the string provided by the user and print the result.

Expected Outcome:
The output should be the length of the user's input string.
 */
public class QuestionFiveSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type something: ");
        String userString;
        userString = input.nextLine();

        System.out.println(userString.length());
    }
}
