package string_methods.equals;
/*
Question 6: Case-Insensitive Comparison

Task:
Given two strings, "Java Programming" and "java programming", write logic that compares them
for equality ignoring case. Print whether they are considered equal.
 */
public class QuestionSixSolver {
    public static void main(String[] args) {
        String field1 = "Java Programming";
        String field2 = "java programming";
        System.out.println(field1.equals(field2));
    }
}
