package string_methods.replace;

/*
Question 10: Replacing Characters at Specific Positions

Task:
Given a string "abcdefghij", replace every second character with "X". You cannot use loops,
 so think about how to creatively use the replace() method to achieve this. Print the result.
 */
public class QuestionTenSolver {
    public static void main(String[] args) {
        String text = "abcdefghij";
        System.out.println(text.substring(0, 1) + "X" +
                text.substring(2, 3) + "X" +
                text.substring(4, 5) + "X" +
                text.substring(6, 7) + "X" +
                text.substring(8, 9) + "X" +
                text.substring(9));

        // another way is this:
        System.out.println(text.replaceAll("[b,d,f,h,j]", "X"));
    }
}
