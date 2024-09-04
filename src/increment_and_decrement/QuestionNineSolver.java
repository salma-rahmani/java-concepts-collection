package increment_and_decrement;
/*
Question 9: Pre-Increment in an Expression

Task:
Given int r = 4; int result = ++r * 2;, evaluate the value of result and r. Print both values.

Expected Output:

result = 10
r = 5
 */

public class QuestionNineSolver {
    public static void main(String[] args) {
        int r = 4;
        int result = ++r * 2;// 5 * 2 => 10
        System.out.println("result = " + result);
        System.out.println("r = " + r); // after the operation the value of r became 5.

    }
}
