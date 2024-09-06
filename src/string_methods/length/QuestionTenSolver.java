package string_methods.length;

/*
Question 10: Detecting Empty Strings

Task:
Create a series of strings, some of which are empty (e.g., ""). Write a condition that checks
 whether a string is empty using the length() method. Then, print a message indicating
  whether the string is empty or not. Challenge: What happens if the string contains only spaces?

Expected Outcome:
Students should recognize that an empty string has a length of 0 and that strings with spaces are
not considered empty, even though they might "look" empty.
 */
public class QuestionTenSolver {
    public static void main(String[] args) {
        String word = "";
        if (word.length() == 0) {
            System.out.println("The string is empty!");
        } else System.out.println("the string length is: " + word.length());

    }
}
