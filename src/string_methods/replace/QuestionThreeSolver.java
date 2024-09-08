package string_methods.replace;
/*
Question 3: Case-Sensitive Replacement

Task:
Given a string "Java programming is fun", use the replace() method to replace "Java" with "Python".
 Print the result.

Expected Output:

kotlin

Python programming is fun
 */
public class QuestionThreeSolver {
    public static void main(String[] args) {
        String message = "Java programming is fun";
        System.out.println(message.replaceAll("Java", "Python"));

    }
}
