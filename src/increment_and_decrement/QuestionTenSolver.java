package increment_and_decrement;

/*
Question 10: Pre-Decrement in an Expression

Task:
Given int s = 12; int result = --s / 3;, evaluate the value of result and s. Print both values.

Expected Output:

result = 3
s = 11
 */
public class QuestionTenSolver {
    public static void main(String[] args) {
        int s = 12;
        int result = --s / 3; // 11/3 since it integer so it ignores the decimal part
        System.out.println("result =" + result);
        System.out.println("s = " + s); // after the operation the value of s became 11

    }
}
