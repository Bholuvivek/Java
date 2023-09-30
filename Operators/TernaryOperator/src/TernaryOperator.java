//  Ternary Operator
// This  is the only conditional operator that takes three operands.
// It’s a one-liner replacement for the if-then-else statement and is used
// a lot in Java programming.

// This is Operator use in place of If- Else and also Place of Switch

public class TernaryOperator {
    public static void main(String[] args) {

        int num1 = 15, num2 = 10, result;

        System.out.println("First num: " + num1);
        System.out.println("Second num: " + num2);


        result = (num1 > num2) ? (num1 + num2) : (num1 - num2);


        System.out.println("Result = " + result);

    }
}