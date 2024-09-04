package operator_precedence;
/*
Question 9: Combining Arithmetic and Relational Operators

Task:
Given the expression 5 + 3 > 2 * 3, evaluate the result and print it. Explain the precedence of arithmetic operations over relational operators.

Expected Output:

true
 */
public class QuestionNineSolver {
    public static void main(String[] args) {
        System.out.println(5 + 3 > 2 * 3);
         /*
        In this expression, the multiplication operator has higher precedence,
        so 2 * 3 is evaluated first, resulting in 6.

        Then, the addition operation is performed: 5 + 3 equals 8.

        Finally, the comparison 8 > 6 is evaluated, and since 8 is greater than 6, the result is true.
        */
    }
}
