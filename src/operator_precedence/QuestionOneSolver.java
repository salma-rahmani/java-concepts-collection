package operator_precedence;
/*
Question 1: Basic Arithmetic Operations

Task:
Given the expression 5 + 3 * 2, evaluate the result and print it. Explain how operator precedence influences the outcome.

Expected Output:

11
 */
public class QuestionOneSolver {
    public static void main(String[] args) {
        System.out.println(5 + 3 * 2);
        /*
         In this expression, multiplication has a higher priority than addition.
         Therefore, 3 * 2 is evaluated first, resulting in 6.
         Then, 5 + 6 is evaluated, resulting in the final output of 11.
         */
    }
}
