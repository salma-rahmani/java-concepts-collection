package casting;

/*
Question 6: Narrowing Cast with Overflow

Task:
Given a long variable bigNum = 2147483648L, cast it to an int and print the result.
Explain what happens when the value exceeds the int range.
 */

public class CastingQuestionSixSolver {
    public static void main(String[] args) {

        long bigNum = 2147483648L;
        int var = (int) bigNum;
        System.out.println(var);

        System.out.println("*******************************");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

/*
When we cast a value that exceeds the int range, it overflows,causing the value to wrap around within the int range.
This is why the result after casting is -2147483648, the minimum value an int can hold.
 */
    }
}
