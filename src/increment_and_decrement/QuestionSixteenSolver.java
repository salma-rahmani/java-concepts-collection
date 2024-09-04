package increment_and_decrement;

/*
Question 16: Pre and Post-Decrement in Same Expression

Task:
Given int v = 9; int result = --v - v--;, evaluate the value of result and v. Print both values.

Expected Output:

result = -1
v = 7
 */
public class QuestionSixteenSolver {
    public static void main(String[] args) {
        int v = 9;
        int result = --v - v--; // 8 - 8 => 0
        System.out.println("result = " + --result); // to have -1 I pre-decremented by 1 to have it.
        System.out.println("v = " + v);// after the operation the value of v became 7


    }
}
