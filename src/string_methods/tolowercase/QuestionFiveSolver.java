package string_methods.tolowercase;

/*
Question 5: Case Insensitivity Check

Task:
Given two strings "Hello" and "HELLO", use the toLowerCase() method to check if they are equal
when converted to lowercase. Print the result.

Expected Output:

true
 */
public class QuestionFiveSolver {
    public static void main(String[] args) {
        String word1 = "Hello";
        String word2 = "HELLO";
        //System.out.println(word1.equals(word2));
        System.out.println(word1.toLowerCase().equals(word2.toLowerCase()));
    }
}
