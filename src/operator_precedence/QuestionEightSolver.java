package operator_precedence;
/*
Question 8: Precedence in Boolean Expressions

Task:
Given the expression true || false && false, evaluate the result and print it. Explain the precedence of logical AND (&&) over logical OR (||).

Expected Output:

true
 */

public class QuestionEightSolver {
    public static void main(String[] args) {
        System.out.println(true || false && false);
       /*
        In this expression, there are two logical operators, && (AND) and || (OR).
        The && operator has higher precedence than ||.

        First, the expression `false && false` is evaluated, resulting in `false`.
        Then, `true || false` is evaluated. Since the OR operator returns true if at least one operand is true,
        the final result is `true`.

        Therefore, the output will be true.
        */
    }
}
