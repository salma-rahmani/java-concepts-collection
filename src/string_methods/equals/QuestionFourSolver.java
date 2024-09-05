package string_methods.equals;

/*
Question 4: Comparing with a Variable

Task:
Create a string variable str1 with the value "Programming" and another string variable str2
with the value "Programming". Use the equals() method to check if str1 is equal to str2.
 Print the result.

Expected Output:

true
 */
public class QuestionFourSolver {
    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = "Programming";
        if (str1.equals(str2))
            System.out.println(true);
        else System.out.println(false);


    }
}
