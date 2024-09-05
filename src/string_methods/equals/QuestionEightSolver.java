package string_methods.equals;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

/*
Question 8: Dynamic String Comparison

Task:
Given a string "OpenAI" and a user-defined input string (assume the user enters "openai"),
use the equals() method to check if the strings are exactly equal. If they are not, print "Strings
do not match exactly".
 */
public class QuestionEightSolver {
    public static void main(String[] args) {
        String subject = "OpenAI";
        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter your string: ");
        String user_defined;
        user_defined = input.next();
        if (user_defined.equals(subject)) System.out.println("Strings are Equal");
        else System.out.println(" Strings do not match exactly");
    }
}
