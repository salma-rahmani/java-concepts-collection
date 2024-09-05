package string_methods.equals;

/*
Question 7: Comparing Strings with Leading or Trailing Spaces

Task:
Given two strings, " Hello " and "Hello", use the trim() method in combination with equals()
to check if they are equal after removing leading and trailing spaces. Print the result.
 */
public class QuestionSevenSolver {
    public static void main(String[] args) {
        String text1 = " Hello ";
        String text2 = "Hello";
        System.out.println(text1.trim().equals(text2));

    }
}
