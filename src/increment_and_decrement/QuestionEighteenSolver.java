package increment_and_decrement;
/*
Question 18: Using Decrement in a While Loop Condition

Task:
Given int b = 5; while (b-- > 0) { System.out.println(b); }, determine the output and explain the order in which the decrement and comparison are performed.

Expected Output:

4
3
2
1
0
 */

public class QuestionEighteenSolver {
    public static void main(String[] args) {

        int b = 5;
        while (b-- > 0) // In this condition first number that it checks is 5>0 next step is to print
            // the value of b which became 4, then 4> 0 , and it prints 3, then 3>0 it prints 2
            // then 2> 0, and it prints 1 then 1> 0, and it prints 0 since the 0 is not bigger than 0,
            // so it stops
        { System.out.println(b);
        }

    }
}
