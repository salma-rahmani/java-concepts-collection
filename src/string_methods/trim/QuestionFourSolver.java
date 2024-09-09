package string_methods.trim;

/*
Question 4: Trimming Special Characters

Task:
Given a string "\tJava\n", use the trim() method to remove any leading or trailing whitespace,
including tab and newline characters. Print the result.

Expected Output:

Java
 */
public class QuestionFourSolver {
    public static void main(String[] args) {
        String text = "\tJava\n";
        System.out.println(text.trim());

    }
}
