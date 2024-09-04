package increment_and_decrement;

/*
Question 7: Using Increment in an Expression

Task:
Given int p = 5; int result = p++ + 2;, evaluate the value of result and p. Print both values.

Expected Output:

makefile

result = 7
p = 6
 */
public class QuestionSevenSolver {
    public static void main(String[] args) {
        int p = 5;
        int result = p++ + 2; // 5+ 2 =>7
        System.out.println("result = " + result);
        System.out.println("p = " + p); // after the operation the value of p became 6
    }
}
