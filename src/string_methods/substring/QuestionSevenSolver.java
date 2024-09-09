package string_methods.substring;

/*
Question 7: Conditional Substring Extraction

Task:
Given a string that might vary in length, such as "WelcomeToJavaProgramming",
write a condition that extracts the first half of the string if its length is even,
 or the first three characters if its length is odd. Use the substring() method and print the result.


 */
public class QuestionSevenSolver {
    public static void main(String[] args) {
        String phrase = "WelcomeToJavaProgramming";
        System.out.println(phrase.length());
        if (phrase.length() % 2 == 0) {
            int result = phrase.length() / 2;
            System.out.println(phrase.substring(0, result));
        } else System.out.println(phrase.substring(0, 3));
    }
}
