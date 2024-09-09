package string_methods.substring;

/*
Question 10: Reconstructing a Sentence

Task:
Given the sentence "Java is fun to learn", use the substring() method to extract and reorder
 the words to form the sentence "learn to fun Java is". You may only use substring() and concatenation.
 Print the final result.


 */
public class QuestionTenSolver {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";
        System.out.println(sentence.length());
        String word1 = sentence.substring(15,20);
        String word2 = sentence.substring(12, 14);
        String word3 = sentence.substring(8,11);
        String word4 = sentence.substring(0, 4);
        String word5 = sentence.substring(5,7);
        System.out.println(word1 + " " + word2 + " "+ word3 + " "+ word4 + " "+ word5 );

    }
}
