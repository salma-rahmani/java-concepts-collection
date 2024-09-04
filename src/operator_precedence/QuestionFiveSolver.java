package operator_precedence;
/*
Question 5: Using Modulus with Addition

Task:
Given the expression 7 + 9 % 4, evaluate the result and print it. Explain how the modulus operator is evaluated before addition.

Expected Output:

10
 */

public class QuestionFiveSolver {
    public static void main(String[] args) {
        System.out.println(7 + 9 % 4);
        /*
        In this expression:
        First, the modulus operation is performed: 9 % 4, which equals 1 (since 9 divided by 4 leaves a remainder of 1).
        Then, the addition is performed: 7 + 1, resulting in 8. Don't know why it expected 10 !!
        */
    }
}
