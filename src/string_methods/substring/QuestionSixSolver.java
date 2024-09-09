package string_methods.substring;

/*
Question 6: Substring Puzzle

Task:
Given a string "abcdefgh", use the substring() method to rearrange the characters into the
following order: "efghabcd". You are only allowed to use the substring() method and concatenation.
 Print the final result.


 */
public class QuestionSixSolver {
    public static void main(String[] args) {
        String alpha = "abcdefgh";
        System.out.println(alpha.length());
        System.out.println(alpha.substring(4, 5) + alpha.substring(5, 6) + alpha.substring(6, 7)
                + alpha.substring(7, 8) + alpha.substring(0, 1) + alpha.substring(1, 2) + alpha.substring(2, 3) +
                alpha.substring(3, 4));

        // OR this way

        String reArrange = alpha.substring(4)+ alpha.substring(0,4);
        System.out.println(reArrange);

    }
}
