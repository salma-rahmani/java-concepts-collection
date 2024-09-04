package increment_and_decrement;
/*
Question 11: Multiple Increments

Task:
Given int x = 1; int y = 2; int result = x++ + ++y;, evaluate the value of result, x, and y. Print all values.

Expected Output:

result = 4
x = 2
y = 3
 */

public class QuestionElevenSolver {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int result = x++ + ++y;  // 1 + 3 => 4
        System.out.println("result = " + result);
        System.out.println("x = " + x);  // The last time x was incremented by 1, so it became 2
        System.out.println("y = " + y);  // It is also obvious since y is pre-incremented, so it is 3
    }
}
