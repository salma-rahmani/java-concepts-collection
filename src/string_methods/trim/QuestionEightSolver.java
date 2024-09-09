package string_methods.trim;

/*
Question 8: Trimming and Replacing

Task:
Given a string " Hello World ", use the trim() method to remove the leading and trailing spaces.
 Then, use the replace() method to replace all remaining spaces between "Hello" and "World" with a
 single space. Print the final result.
 */
public class QuestionEightSolver {
    public static void main(String[] args) {
        String message = " Hello World ";
        // For removing all spaces we need to have this syntax replaceAll(" ", "")
        // If we want to remove all spaces and have only one single space between words so need to have the
        // below syntax
        System.out.println(message.trim().replaceAll("\\\\s+", " "));

    }
}
