package string_methods.trim;
/*
Question 9: Trimming and Case Conversion

Task:
Given a string " java programming ", use the trim() method to remove the spaces,
and then convert the string to uppercase using the toUpperCase() method. Print the final result.
 */
public class QuestionNineSolver {
    public static void main(String[] args) {
        String title = " java programming ";
        System.out.println(title.trim().toUpperCase());
    }
}
