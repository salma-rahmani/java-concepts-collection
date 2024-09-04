/*
Question 1: Implicit Casting

Task:
Given an int variable num = 10, assign it to a double variable. Print the double variable to observe the implicit casting. Explain why this type of casting is allowed.

Expected Output:

10.0
*/

package casting;

public class CastingQuestionOneSolver {
    public static void main(String[] args) {
        int num = 10;
        double var = num;
        System.out.println(var);
        // In implicit casting, we cast a short primitive data type to a long one, ensuring no loss of data.
        // It was the reason that it allowed.


    }
}
