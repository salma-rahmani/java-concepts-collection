package casting;

/*
Question 7: Casting Between Primitive and Wrapper Types

Task:
Given an Integer object num = 50, manually cast it to an int and perform an
arithmetic operation (e.g., num + 10). Print the result. Explain how unboxing works in Java.
 */
public class CastingQuestionSevenSolver {
    public static void main(String[] args) {
        Integer num = 50;
        int var = num;
        int result = num + 10;
        System.out.println(result);
        /*
        In Java, unboxing occurs automatically when we use an Integer object in a context
        that requires an int. In this example, num is unboxed to int when assigned to var.
         */

    }
}
