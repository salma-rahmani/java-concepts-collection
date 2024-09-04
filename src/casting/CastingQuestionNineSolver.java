package casting;
/*
Question 9: Casting Larger Data Types to Smaller

Task:
Given a double variable decimalValue = 123.456, cast it to a byte and print the result.
 Explain the outcome and potential data loss.
 */

public class CastingQuestionNineSolver {
    public static void main(String[] args) {
        double decimalValue = 123.456;
        byte var = (byte) decimalValue;
        System.out.println(var);

        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        /*
        Since the range of Byte is -128 to 127, so it could easily lost the decimal part .456 and printer 123
         */

    }
}
