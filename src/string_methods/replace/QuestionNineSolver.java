package string_methods.replace;
/*
Question 9: Handling Multiple Replacements

Task:
Given a string "Java, Java, Java", replace only the second occurrence of "Java"
with "Python". Print the final result.
 */
public class QuestionNineSolver {
    public static void main(String[] args) {
        String field = "Java, Java, Java";
       // System.out.println(field.replaceAll("[field.charAt(6,10]", "Python"));
        System.out.println(field.substring(6, 10).replace("Java", "Java, Python, Java"));
        System.out.println(field.replaceFirst("Java, Java", "Java, Python"));
    }
}
