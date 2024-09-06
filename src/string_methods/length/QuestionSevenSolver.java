package string_methods.length;

/*
Question 7: Length Comparison

Task:
Create two strings: "Hello" and "world". Use the length() method to compare the lengths of these two strings. Then, write a statement that prints which string is longer, or if they are of equal length.

Expected Outcome:
Students should determine which string is longer and be able to articulate how they reached that conclusion.
 */
public class QuestionSevenSolver {
    public static void main(String[] args) {
        String value1 = "Hello";
        String value2 = "world";

        if (value1.length() == value2.length()) {
            System.out.println("Both strings have the same length.");
        } else if (value1.length() > value2.length()) {
            System.out.println(value1 + " is longer than " + value2);
        } else {
            System.out.println(value2 + " is longer than " + value1);
        }
    }
}
