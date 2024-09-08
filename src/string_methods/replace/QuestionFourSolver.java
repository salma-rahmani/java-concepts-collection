package string_methods.replace;

/*
Question 4: Removing Substrings

Task:
Given a string "I love apples", use the replace() method to remove the word "apples" by
replacing it with an empty string. Print the result.

Expected Output:

I love
 */
public class QuestionFourSolver {
    public static void main(String[] args) {
        String senetence = "I love apples";
        System.out.println(senetence.replaceAll("apples", " "));
    }
}
