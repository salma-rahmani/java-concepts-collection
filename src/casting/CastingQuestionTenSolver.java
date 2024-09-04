package casting;
/*
Question 10: Object to Specific Type Casting

Task:
Given an Object variable obj = "Hello", manually cast it to a String and print the length
of the string using the length() method. Explain when and why this type of casting is needed.
 */


public class CastingQuestionTenSolver {
    public static void main(String[] args) {
        Object obj = "Hello";
        String strName = (String) obj;
        System.out.println(strName.length());

/*
This type of casting is needed to access type-specific functionality and ensures that the operations
 we perform on the object are valid for its actual type.
 */
    }
}
