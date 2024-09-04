package operator_precedence;

import java.util.Scanner;

/*
Question 10: Complex Expression with Scanner Input

Task:
Write a program that asks the user for two integers using the Scanner class.
Then, calculate and print the result of the expression
 (firstNumber + secondNumber) * firstNumber / secondNumber + 2.
 Explain how the precedence rules are applied in this expression.

Sample Input:

Enter first number: 4
Enter second number: 2

Expected Output:

Result: 12
 */
public class QuestionTenSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        System.out.print(" Please enter the first number: ");
        firstNumber = input.nextInt();
        System.out.print("Please enter the second number: ");
        secondNumber = input.nextInt();
        int result = (firstNumber + secondNumber) * firstNumber / secondNumber + 2;
        System.out.println("Result: " + result);

         /*
        Explanation of the expression (4 + 2) * 4 / 2 + 2:
        Parentheses: Calculate 4 + 2 = 6
        Division: Divide the 4/2 = 2
        Multiplication: 6 * 2 = 12
        Addition**: Finally, add 12 + 2 = 14
        So, the result will be 14, not 12
        */
    }
}
