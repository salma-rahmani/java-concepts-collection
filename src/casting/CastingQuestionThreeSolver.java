package casting;
/*
Question 3: Char to Int

Task:
Given a char variable ch = 'A', cast it to an int and print the result. Explain what value is printed and why.

Expected Output:

65
 */

public class CastingQuestionThreeSolver {
    public static void main(String[] args) {
        char ch = 'A';
        int var = ch;
        System.out.println(var);

        /*

In Java, Characters in Java are represented using the Unicode system, which is a standard encoding scheme
that assigns a unique number (code point) to every character. The character 'A' has an ASCII value of 65.
When we assign a char to an int, Java automatically converts the character to its ASCII value.
*/
    }
}
