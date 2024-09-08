package string_methods.replace;

/*
Question 6: Multiple Replacements

Task:
Given a string "She sells sea shells by the sea shore", replace all occurrences of "sea"
with "ocean" and "shells" with "stones". Print the final result.
 */
public class QuestionSixSolver {
    public static void main(String[] args) {
        String text = "She sells sea shells by the sea shore";
        System.out.println(text.replace("sea", "ocean").replace("shells", "stones"));
    }
}
