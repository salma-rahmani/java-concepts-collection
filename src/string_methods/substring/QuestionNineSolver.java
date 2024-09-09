package string_methods.substring;

/*
Question 9: Substring from a Dynamic Index

Task:
Given a string "Let's learn Java", extract a substring starting from the second occurrence of the letter
"e" to the end of the string. Use the substring() method and print the result.

 */
public class QuestionNineSolver {
    public static void main(String[] args) {
        String message = "Let's learn Java";
        int indexOfFirstE = message.indexOf('e');
        int indexOfSecondE = message.indexOf('e', indexOfFirstE + 1);
        String result = message.substring(indexOfSecondE);
        System.out.println(result);
    }
}
