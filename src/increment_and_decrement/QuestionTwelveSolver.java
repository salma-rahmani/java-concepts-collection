package increment_and_decrement;
/*
Question 12: Mixed Increments and Decrements

Task:
Given int a = 10; int b = 5; int result = a-- - ++b;, evaluate the value of result, a, and b. Print all values.

Expected Output:

result = 4
a = 9
b = 6
 */

public class QuestionTwelveSolver {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = a-- - ++b; // 10 -6 => 4
        System.out.println("result = " + result);
        System.out.println("a = " + a); // after the operation the value of a became 9
        System.out.println("b = " + b); // after the operation the value of b became 6


    }
}
