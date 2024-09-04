package casting;

/*
Question 4: Long to Int Casting

Task:
Given a long variable longNum = 1000000L, cast it explicitly to an int and print the result. Ensure no data is lost, and explain when this type of casting is necessary.

Expected Output:

1000000
 */
public class CastingQuestionFourSolver {
    public static void main(String[] args) {
        long longName = 1000000L;
        int var = (int) longName;
        System.out.println(var);


    }
}
