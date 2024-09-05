package string_methods.charat;
/*
Question 10: Checking for Vowels at Specific Positions

Task:
Given a string "Umbrella", use the charAt() method to check if the first and last characters are vowels.
Print true if both are vowels, otherwise print false.
 */

public class QuestionTenSolver {
    public static void main(String[] args) {
        String stuff = "Umbrella";

        char firstChar = stuff.charAt(0);
        char lastChar = stuff.charAt(stuff.length() - 1);

        boolean isFirstVowel = (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u');

        boolean isLastVowel = (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u');

        System.out.println(isFirstVowel && isLastVowel);
    }
}

