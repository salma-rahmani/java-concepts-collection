package increment_and_decrement;

/*
Question 8: Using Decrement in an Expression

Task:
Given int q = 8; int result = q-- + 3;, evaluate the value of result and q. Print both values.

Expected Output:

result = 11
q = 7
 */
public class QuestionEightSolver {
    public static void main(String[] args) {
        int q = 8;
        int result = q-- + 3; // q is 8 since it is post-decrement, so 8 + 3 => 11
        System.out.println("result = " + result);
        System.out.println("q = " + q); // q is now 7 after the post-decrement
    }
}
