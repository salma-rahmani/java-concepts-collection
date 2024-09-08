package string_methods.replace;

/*
Question 2: Replacing Characters

Task:
Given a string "banana", use the replace() method to change all occurrences of the letter "a" to "o".
 Print the result.

Expected Output:

bonono
 */
public class QuestionTwoSolver {
    public static void main(String[] args) {
        String fruit = "banana";
        System.out.println(fruit.replaceAll("a", "o"));
    }
}
