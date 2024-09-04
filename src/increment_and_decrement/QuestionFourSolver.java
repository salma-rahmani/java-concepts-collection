package increment_and_decrement;

/*
Question 4: Post-Decrement

Task:
Given an int variable b = 15, use post-decrement (b--) and then print b. Explain the order in which the operations are performed.

Expected Output:

15
14
 */

public class QuestionFourSolver {
    public static void main(String[] args) {
        int b =15;
        System.out.println(b--); // The current value of b is printed first, then b is decremented by 1.
        System.out.println(b--);

    }
}
