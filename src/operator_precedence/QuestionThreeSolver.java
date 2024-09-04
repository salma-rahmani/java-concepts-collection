package operator_precedence;
/*
Question 3: Mixed Operators

Task:
Given the expression 10 - 4 + 2 * 3, evaluate the result and print it. Explain the order in which the operations are performed.

Expected Output:

12
 */

public class QuestionThreeSolver {
    public static void main(String[] args) {
        System.out.println(10 - 4 + 2 * 3);
        /*
        In this expression, the multiplication is executed first: 2 * 3, which results in 6.
        Then, the subtraction and addition are performed from left to right:
        First, 10 - 4 is calculated, resulting in 6.
        Then, 6 + 6 is performed, resulting in 12.
         */
    }
}
