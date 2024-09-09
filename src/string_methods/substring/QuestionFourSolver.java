package string_methods.substring;

/*
Question 4: Finding Substrings within a String

Task:
Given a string "OpenAI is awesome!", find the substring "AI" within the string.
Use the substring() method in combination with the indexOf() method to extract "AI" and print it.
 Explain how you located the substring.


 */
public class QuestionFourSolver {
    public static void main(String[] args) {
        String title = "OpenAI is awesome!";

        // In this line of code we found out the first character index which is 4
        int startIndex = title.indexOf("AI");
        System.out.println(startIndex);
        // Extract the substring starting from the startIndex to startIndex + length of "AI" to find the last character indext
        String result = title.substring(startIndex, startIndex + "AI".length());
        System.out.println(startIndex + "AI".length());
        System.out.println(result);


    }
}
