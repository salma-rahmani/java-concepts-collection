package string_methods.contains;

import java.util.Scanner;

/*
Question 9: Dynamic Substring Search

Task:
Given a string "The quick brown fox jumps over the lazy dog", use the contains() method to check
if the string contains a user-defined substring. Assume the user provides the substring "fox".
Print whether the substring is found.
 */
public class QuestionNineSolver {
    public static void main(String[] args) {
        String message = "The quick brown fox jumps over the lazy dog";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the substring you want to search for: ");
        String userSubstring = input.nextLine();

        if (message.contains(userSubstring)) {
            System.out.println("The substring " + userSubstring + " was found.");
        } else {
            System.out.println("The substring " + userSubstring + " was not found.");
        }
    }
}
