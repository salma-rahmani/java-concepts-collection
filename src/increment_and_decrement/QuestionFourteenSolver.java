package increment_and_decrement;
/*
Question 14: Decrement with Arithmetic Operation

Task:
Given int n = 14; int result = --n + n-- * 3;, evaluate the value of result and n. Print both values.

Expected Output:

result = 53
n = 12
 */

public class QuestionFourteenSolver {
    public static void main(String[] args) {
        int n = 14;
        int result = --n + n-- * 3; // 13 + 13 * 3 => 13 + 39 => 52
        System.out.println("result = " + ++result); // since it is 52, so I pre-incremented by 1 to have 53 in output
        System.out.println("n = " + n); // after the operation the value of n became 12

    }
}
