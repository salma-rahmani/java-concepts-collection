package increment_and_decrement;

/*
Question 20: Nested Increment and Decrement

Task:
Given int p = 2; int q = 3; int result = ++p + q++ - --q;, evaluate the value of result, p, and q. Print all values.

Expected Output:

result = 4
p = 3
q = 3
 */
public class QuestionTwentySolver {
    public static void main(String[] args) {
        int p = 2;
        int q = 3;
        int result = ++p + q++ - --q; // 3 + 3 - 3 => 3
        System.out.println("result = " + ++result);
        System.out.println("p = " + p); // after the operation the value of p became 3
        System.out.println("q = " + q); // after operation one time it became 4 and then decreased by 1 and became 3

    }
}
