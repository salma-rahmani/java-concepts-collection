package string_methods.length;

/*
Question 6: Hidden Lengths

Task:
Create a string that includes leading and trailing spaces, such as " Java ". Without removing the
spaces, use the length() method to determine the length of the string.
 Then, explain how the length changes if the spaces are removed from the start and end of the string.

Expected Outcome:
Students should observe that spaces count towards the total length and compare the results with the length of the trimmed string.

 */
public class QuestionSixSolver {
    public static void main(String[] args) {
        String value = " Java ";
        System.out.println(value.length());
        System.out.println(value.replaceAll(" ", "").length());
        System.out.println(value.trim().length());
        /*
        The original length counts both the leading and trailing spaces. For " Java ", it will be 6.
        The replaceAll method removes all spaces, including any between words.
        The trim method removes only the leading and trailing spaces but keeps any in between, since there
        is no space between the words, so it has the same result as replaceAll method.
         */
    }
}
