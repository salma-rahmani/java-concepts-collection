package increment_and_decrement;
/*
Question 17: Using Increment in an If Statement

Task:
Given int a = 4; if (++a == 5) { System.out.println("Equal"); } else { System.out.println("Not Equal"); }, determine what is printed and explain why.

Expected Output:

Equal
 */

public class QuestionSeventeenSolver {
    public static void main(String[] args) {

        int a = 4;
        if (++a == 5) {
            // in this statement, since it is pre-incremented so the value of a became 5, and it is equal to 5 so the first condition is true and it prints Equal
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }


    }
}
