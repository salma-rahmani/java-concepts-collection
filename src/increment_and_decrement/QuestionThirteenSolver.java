package increment_and_decrement;
/*
Question 13: Increment with Arithmetic Operation

Task:
Given int m = 7; int result = m++ * 2 + --m;, evaluate the value of result and m. Print both values.

Expected Output:

result = 21
m = 7
 */

public class QuestionThirteenSolver {
    public static void main(String[] args) {
        int m = 7;
        int result = m++ * 2 + --m; // 7 *2 + (--8) => 14 + 7 => 21
        System.out.println("result = " + result);
        System.out.println("m = " + m); // after the operation the value of m became 7


    }
}
