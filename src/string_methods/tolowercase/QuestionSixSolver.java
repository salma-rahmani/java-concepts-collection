package string_methods.tolowercase;

import org.w3c.dom.ls.LSOutput;

/*
Question 6: Case Conversion and Replacement

Task:
Given a string "TeXT aND mORe TeXT", use the toLowerCase() method and replace() method together
 to convert the string to lowercase and then replace all occurrences of "text" with "data".
 Print the final result.
 */
public class QuestionSixSolver {
    public static void main(String[] args) {


        String message = "TeXT aND mORe TeXT";
        System.out.println(message.toLowerCase().replaceAll("text", "data"));
    }
}
