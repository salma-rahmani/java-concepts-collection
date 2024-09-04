package increment_and_decrement;

/*
Question 15: Pre and Post-Increment in Same Expression

Task:
Given int u = 3; int result = ++u + u++;, evaluate the value of result and u. Print both values.

Expected Output:

result = 8
u = 5
 */
public class QuestionFifteenSolver {
    public static void main(String[] args) {
        int u = 3;
        int result = ++u + u++; // 4+ 4 => 8
        System.out.println("result = " + result);
        System.out.println("u = " + u); // u is 5 after the operations

    }
}
