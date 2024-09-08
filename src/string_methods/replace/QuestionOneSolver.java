package string_methods.replace;

/*
Question 1: Simple Replacement

Task:
Given a string "Hello World", use the replace() method to change "World" to "Java". Print the result.


Expected Output:

Hello Java
 */
public class QuestionOneSolver {
    public static void main(String[] args) {
        String message = "Hello World";
        System.out.println(message.replaceAll("World", "Java"));
    }
}
