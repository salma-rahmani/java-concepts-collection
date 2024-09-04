package increment_and_decrement;
/*
Question 3: Post-Increment

Task:
Given an int variable a = 7, use post-increment (a++) and then print a. Explain the order in which the operations are performed.

Expected Output:

7
8
 */

public class QuestionThreeSolver {
    public static void main(String[] args) {
        int a = 7;

        System.out.println(a++); // it will print the same value then it will increase by 1.
        System.out.println(a++);

    }
}
