package string_methods.tolowercase;

/*
Question 7: Checking Palindrome Ignoring Case

Task:
Given a string "Madam", use the toLowerCase() method to check if the string is a palindrome,
 ignoring case differences. Print whether the string is a palindrome.
 */
public class QuestionSevenSolver {
    public static void main(String[] args) {
        String word = "Madam";
        String lowerWord = word.toLowerCase();
        String reverse = new StringBuilder(lowerWord).reverse().toString();
        if (lowerWord.equals(reverse) ){
            System.out.println("Yes same");
        }
        else {
            System.out.println("Not same");
        }


    }
}
