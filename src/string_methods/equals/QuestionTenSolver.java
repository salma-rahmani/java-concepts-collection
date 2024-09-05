package string_methods.equals;
/*
Question 10: Comparing Substrings for Equality

Task:
Given a string "Welcome to Java Programming", extract the substring "Java" and compare
it with the string "Java" using the equals() method. Print whether they are equal.
 */
public class QuestionTenSolver {
    public static void main(String[] args) {
        String value1 = "Welcome to Java Programming";
        String value2 = "Java";
        System.out.println(value1.substring(11, 15).equals(value2));

    }
}
