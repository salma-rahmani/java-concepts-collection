package string_methods.trim;

/*
Question 10: Trimming in a Sentence

Task:
Given a sentence where each word is surrounded by spaces, such as " Java is awesome ",
use the trim() method in combination with the replace() method to ensure each word is
properly spaced with only one space between words. Print the final result.
 */
public class QuestionTenSolver {
    public static void main(String[] args) {
        String sentence = " Java is awesome ";
        System.out.println(sentence.trim().replaceAll("\\s+", " "));

    }
}
