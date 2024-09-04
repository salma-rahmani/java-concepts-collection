package operator_precedence;
/*
Question 2: Combining Addition and Parentheses

Task:
Given the expression (5 + 3) * 2, evaluate the result and print it. Explain how parentheses change the evaluation order.

Expected Output:

16
 */

public class QuestionTwoSolver {
    public static void main(String[] args) {
        System.out.println((5 + 3) * 2);
       /*
        In this expression, the parentheses have the highest precedence.
        Therefore, the operation inside the parentheses (5 + 3) is evaluated first, resulting in 8.
        Then, the multiplication is performed: 8 * 2, which results in 16.
         */
    }
}
