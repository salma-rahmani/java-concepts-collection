package operator_precedence;
/*
Question 7: Precedence of Concatenation

Task:
Given the expression "Result: " + 5 + 3 * 2, evaluate the result and print it. Explain how concatenation works with arithmetic operations.

Expected Output:

Result: 511
 */

public class QuestionSevenSolver {
    public static void main(String[] args) {
        System.out.println("Result: " + 5 + 3 * 2);
        /*
        In this expression:
        First, the multiplication is performed: 3 * 2 = 6.
        Then, the concatenation happens from left to right. First, "Result: " is concatenated with 5,
        resulting in "Result: 5".
        Finally, "Result: 5" is concatenated with 6, leading to the output "Result: 56".

        Since the string concatenation occurs, the arithmetic addition is not performed after "Result: ".
        */

    }
}
