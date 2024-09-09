package string_methods.substring;

/*
Question 8: Finding Overlapping Substrings

Task:
Given a string "bananas", use the substring() method to find all occurrences of the
substring "ana". Print the starting index of each occurrence. Hint:
Consider how you might reuse the starting index to find overlapping substrings.


 */

public class QuestionEightSolver {
    public static void main(String[] args) {
        String fruit = "bananas";
        String target = "ana";

        // Iterate over the string to find all occurrences of "ana"
        for (int index = fruit.indexOf(target); index != -1; index = fruit.indexOf(target, index + 1)) {
            System.out.println(index);  // Print the starting index of each occurrence
        }
    }
}

