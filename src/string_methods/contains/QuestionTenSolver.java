package string_methods.contains;

/*
Question 10: Case-Insensitive Substring Check

Task:
Given a string "Data Mining Techniques", check if it contains the word "data" in a
 case-insensitive manner. If it does, print "Match found", otherwise print "No match found".
 */
public class QuestionTenSolver {
    public static void main(String[] args) {
        String message = "Data Mining Techniques";
        if (message.toLowerCase().contains("data".toLowerCase())) {
            System.out.println("Match found");
        } else System.out.println("No match found");
    }
}
