package string_methods.length;

/*
Question 8: Dynamic String Lengths

Task:
Create a string with the initial value "Java". Add another word to this string,
such as "Programming", by concatenating it. Before and after concatenating, use
 the length() method to calculate the length of the string. Print both lengths and describe the change.

Expected Outcome:
Students should observe how the length changes dynamically when new content is added to a string.
 */
public class QuestionEightSolver {
    public static void main(String[] args) {
        String word1 = "Java";
        System.out.println(word1.length());
        word1 = word1 + "Programming";
        System.out.println(word1.length());

        /*
        Before concatenation, the length is 4 (for "Java").
        After adding "Programming", the new length is 15 (JavaProgramming).
        */


    }
}
