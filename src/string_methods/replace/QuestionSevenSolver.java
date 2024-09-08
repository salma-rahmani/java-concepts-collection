package string_methods.replace;

/*
Question 7: Conditional Replacement

Task:
Given a string "The quick brown fox jumps over the lazy dog", replace the word "quick" with
 "slow" only if the string contains the word "fox". Print the result.
 */
public class QuestionSevenSolver {
    public static void main(String[] args) {
        String message = "The quick brown fox jumps over the lazy dog";
        if (message.contains("fox")) {
            System.out.println(message.replace("quick", "slow"));
        } else {
            System.out.println("the original message "+ message);
        }
    }
}
