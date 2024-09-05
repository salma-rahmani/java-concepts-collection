package string_methods.charat;
/*
Question 4: Handling Strings with Special Characters

Task:
Given a string "@OpenAI!", use the charAt() method to access and print the character at index 0 and index 7.

Expected Output:

@
!
 */

public class QuestionFourSolver {
    public static void main(String[] args) {
        String subject = "@OpenAI!";
        System.out.println(subject.charAt(0) + "\n" + subject.charAt(7));
    }
}
