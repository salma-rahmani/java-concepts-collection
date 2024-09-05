package string_methods.contains;

/*
Question 6: Conditional Substring Check

Task:
Given a string "Data Science and AI", check if it contains the word "Science".
If it does, replace the word "Science" with "Analysis" and print the final result.

 */
public class QuestionSixSolver {
    public static void main(String[] args) {
        String message = "Data Science and AI";
        System.out.println(message.contains("Science"));

        if (message.contains("Science")) {
            message= message.replaceAll("Science", "Analysis");
            System.out.println(message);


        }
    }
}
