package string_methods.substring;

/*
Question 5: Extracting Initials

Task:
Given a full name as a string, such as "John Doe", use the substring() method to
extract the initials "J" and "D". Combine these initials to form "JD" and print the result.


 */
public class QuestionFiveSolver {
    public static void main(String args[]) {
        String fullName = "John Doe";

        String firstPart = fullName.substring(0, 1);
        String secondPart = fullName.substring(5, 6);
        System.out.println(firstPart + secondPart);


    }
}
