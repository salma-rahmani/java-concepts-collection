package string_methods.equals;
/*
Question 9: Checking for Null Strings

Task:
Create a string variable str1 with the value null and another string variable str2 with
 the value "null". Use the equals() method to check if they are equal, and handle the null
 case safely. Print the result.
 */
public class QuestionNineSolver {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "null";
        if (str1 != null && str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }



    }
}
