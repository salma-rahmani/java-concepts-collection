package casting;
/*
Question 8: String to Int Conversion (Manual Casting)

Task:
Given a String variable strNum = "123", manually convert it to an int using the Integer.parseInt() method.
Print the result and explain how manual casting from String to int works.
 */
public class CastingQuestionEightSolver {
    public static void main(String[] args) {
        String strNum = "123";
        int var = Integer.parseInt(strNum);
        System.out.println(var);


        /*
        String to int Conversion: The Integer.parseInt() method is a built-in function that safely
         converts a String that represents a valid integer to the int type. If the String cannot
         be converted (e.g., if it contains non-numeric characters), a NumberFormatException will be thrown.
         */
    }
}
