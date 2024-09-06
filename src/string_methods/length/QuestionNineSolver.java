package string_methods.length;

/*
Question 9: Counting Specific Characters

Task:
Given a string like "abracadabra", count how many times a specific character (e.g., "a")
 appears in the string. Use the length() method indirectly by comparing the length of the
 string before and after removing all occurrences of the character "a". Explain the logic
  behind your approach.

Expected Outcome:
Students will need to think about how to use string methods together creatively,
 even though they haven't formally studied loops or advanced methods yet.
 */
public class QuestionNineSolver {
    public static void main(String[] args) {
        String word = "abracadabra";

        // Get the original length of the string
        int originalLengthOfWord = word.length();
        System.out.println("Original length: " + originalLengthOfWord);

        // Remove all occurrences of the character 'a'
        int modifiedLengthOfWord = word.replaceAll("a", "").length();
        System.out.println("Length after removing 'a': " + modifiedLengthOfWord);

        // Calculate the number of occurrences of 'a'
        int countOfACharacter = originalLengthOfWord - modifiedLengthOfWord;
        System.out.println("The character 'a' appears " + countOfACharacter + " times.");
    }
}
