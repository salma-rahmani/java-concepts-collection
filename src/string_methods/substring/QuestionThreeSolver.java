package string_methods.substring;

/*
Question 3: Substring to Reverse a String

Task:
Given a string "ReverseMe", use the substring() method to break the string into two parts: "Reverse"
and "Me". Then, concatenate these two parts in reverse order to form "MeReverse". Print the result.


 */
public class QuestionThreeSolver {
    public static void main(String[] args) {
        String word = "ReverseMe";
        String firstPart = word.substring(0, 7);
        String secondPart = word.substring(7);
        System.out.println(secondPart + "" + firstPart);
    }
}
