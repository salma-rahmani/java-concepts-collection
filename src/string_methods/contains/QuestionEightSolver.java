package string_methods.contains;

import java.util.Scanner;

/*
Question 8: Checking for a Substring in User Input

Task:
Assume you have a string representing user input, "I love programming in Java".
Use the contains() method to check if the input contains the word "Java".
If it does, print a message saying "User is interested in Java".
If not, print "User is interested in something else".
 */
public class QuestionEightSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        System.out.print("Type whatever you want:");
        text = input.nextLine();
        if (text.contains("Java")) {
            System.out.println("User is interested in Java");
        } else
            System.out.println("User is interested in something else");
    }
}
