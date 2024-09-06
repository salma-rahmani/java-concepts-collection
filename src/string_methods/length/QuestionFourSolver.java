package string_methods.length;

/*
Question 4: Combining Strings and Finding Length

Task:
Create two strings: "Hello" and "World". Combine them into one string, "HelloWorld",
and then use the length() method to find the length of the combined string. Print the result.

Expected Outcome:
The output should be the length of the combined string.
 */
public class QuestionFourSolver {
    public static void main(String[] args) {
        String value1 = "Hello";
        String value2 = "World";
        String combine = value1 + value2;
        System.out.println(combine.length());
    }
}
