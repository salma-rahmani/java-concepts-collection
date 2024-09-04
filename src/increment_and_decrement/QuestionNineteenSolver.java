package increment_and_decrement;
/*
Question 19: Combining Increment and Decrement in a Condition

Task:
Given int x = 10; int y = 5; if (x-- > 9 && ++y > 5) { System.out.println("True"); } else { System.out.println("False"); }, determine what is printed and explain why.

Expected Output:

True
 */

public class QuestionNineteenSolver {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        if (x-- > 9 && ++y > 5) { // 10 > 9 and 6> 5 so the both conditions are true and it prints True
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
