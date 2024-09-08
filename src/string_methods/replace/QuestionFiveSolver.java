package string_methods.replace;

/*
Question 5: Replacing Digits

Task:
Given a string "Contact: 123-456-7890", use the replace() method to replace the digits "123" with "000".
 Print the result.

Expected Output:

Contact: 000-456-7890
 */
public class QuestionFiveSolver {
    public static void main(String[] args) {
        String details = "Contact: 123-456-7890";
        System.out.println(details.replaceAll("123", "000"));
    }
}
