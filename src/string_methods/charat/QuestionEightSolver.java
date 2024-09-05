package string_methods.charat;

/*
Question 8: Counting Specific Characters

Task:
Given a string "Mississippi", use the charAt() method to count how many times the character "s" appears
in the string. Print the total count.
 */
public class QuestionEightSolver {
    public static void main(String[] args) {
        String river = "Mississippi";
        int totalCount = 0;
        for (int i = 0; i < river.length(); i++) {
            if (river.charAt(i) == 's') {
                System.out.println();
                totalCount++;
            }
        }
        System.out.println(totalCount);
    }
}
