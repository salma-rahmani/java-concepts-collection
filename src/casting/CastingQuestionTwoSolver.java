package casting;

/*
Question 2: Explicit Casting

Task:
Given a double variable num = 9.8, cast it explicitly to an int and print the result. Explain why data loss occurs during this process.

Expected Output:

9
 */
public class CastingQuestionTwoSolver {
    public static void main(String[] args) {

        double num = 9.8;
        int var = (int) num;
        System.out.println(var);
// In this example of explicit casting, we assigned a larger data type variable to a smaller data type.
// //Since the computer didn't allow it, we forced the conversion, which resulted in some data loss.


    }
}
