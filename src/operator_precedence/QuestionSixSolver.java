package operator_precedence;
/*
Question 6: Order of Operations with Mixed Operators

Task:
Given the expression 3 + 6 * (5 + 4) / 3 - 7, evaluate the result and print it. Explain how the combination of parentheses, multiplication, division, addition, and subtraction is evaluated.

Expected Output:

14
 */
public class QuestionSixSolver {
    public static void main(String[] args) {
        System.out.println(3 + 6 * (5 + 4) / 3 - 7);
        /*
        In this expression,  First, the parentheses are evaluated: (5 + 4) equals 9.
        Then, multiplication is performed 6 * 9 = 54.
        Next, division is carried out: 54 / 3 = 18.
        Addition is performed: 3 + 18 = 21.
        Finally, subtraction will be executed 21 - 7 = 14.
         */
    }
}
