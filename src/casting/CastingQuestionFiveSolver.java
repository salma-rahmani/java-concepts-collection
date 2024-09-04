package casting;
/*
Question 5: Float to Int

Task:
Given a float variable pi = 3.14f, cast it explicitly to an int and print the result. Explain what happens to the decimal part.

Expected Output:

3
 */

public class CastingQuestionFiveSolver {
    public static void main(String[] args) {
        float pi = 3.14f;
        int var = (int) pi;
        System.out.println(var);

    }
}
