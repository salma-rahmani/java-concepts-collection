package string_methods.trim;
/*
Question 7: Combining trim() with Length Check

Task:
Given a string " OpenAI ", use the trim() method and then check if the length of the trimmed string
 is greater than 5. Print whether the condition is true or false.
 */
public class QuestionSevenSolver {
    public static void main(String[] args) {
        String title = " OpenAI ";
        if (title.trim().length()> 5){
            System.out.println("true");
        }
        else
            System.out.println("False");

    }
}
