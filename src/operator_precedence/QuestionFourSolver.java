package operator_precedence;
/*
Question 4: Division and Multiplication with Addition

Task:
Given the expression 8 + 12 / 4 * 2, evaluate the result and print it. Explain the precedence of division and multiplication over addition.

Expected Output:

14
 */
public class QuestionFourSolver {
    public static void main(String[] args) {
        System.out.println(8 + 12 / 4 * 2);
         /*
        In this expression:
        First, the division is performed: 12 / 4, which equals 3.
        Then, the multiplication is performed: 3 * 2, which equals 6.
        Finally, the addition is performed: 8 + 6, resulting in 14.
        */
    }
}
