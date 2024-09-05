package string_methods.charat;
/*
Question 7: Reversing a String Manually

Task:
Given a string "Python", use the charAt() method to manually print the string in reverse order,
character by character.
 */

public class QuestionSevenSolver {
    public static void main(String[] args) {
        String language = "Python";
        System.out.println(language.charAt(5) + " " + language.charAt(4) + " " + language.charAt(3)
                + " " + language.charAt(2) + " " + language.charAt(1) + " " + language.charAt(0));
    }
}
