package string_methods.tolowercase;

/*
Question 10: Complex Case Manipulation

Task:
Given a string "aBcDeFgHiJ", convert the string to lowercase. Then, replace every third character
in the string with "*". Print the final result.
 */
public class QuestionTenSolver {
    public static void main(String[] args) {
        String alpha = "aBcDeFgHiJ";
        alpha = alpha.toLowerCase(); // Convert the string to lowercase
        String result = "";

        // Step 2: Iterate through the string and replace every third character
        for (int i = 0; i < alpha.length(); i++) {
            if ((i + 1) % 3 == 0) {
                result += "*"; // Replace every third character
            } else {
                result += alpha.charAt(i); // Keep the rest unchanged
            }
        }

        // Print the final result
        System.out.println(result);
    }
}
