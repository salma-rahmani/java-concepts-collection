package string_methods.touppercase;

/*
Question 7: Checking Palindrome Ignoring Case

Task:
Given a string "Racecar", use the toUpperCase() method to check if the string is a palindrome,
ignoring case differences. Print whether the string is a palindrome.
 */
public class QuestionSevenSolver {
    public static void main(String[] args) {
        String word = "Racecar";
        String upperWord = word.toUpperCase();
        String reverse = new StringBuilder(upperWord).reverse().toString();
        if (upperWord.equals(reverse)) {
            System.out.println("Yes it is a plindrome");
        } else {
            System.out.println("No ");
        }
    }
}
