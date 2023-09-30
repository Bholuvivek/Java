// In this Program I am going to Write Code about Arithmetics Operatio
// First of all What is Arithmetics Operation - So we can say when we perform Mathematical Calculation,
// So We can say this is Arithmetical Operation
// These are the Arithmetical Operators : "+, -, *, %, /"
// "+" is Use for Addition Operation
// "-" is Use for Subtraction Operation
// "*" is Use for Multiplication
// "%" is USe for Modulo or finding the remainder
// "/" is Use for Division Operation

// This is THe MAin Coding Part
// I am going to write code in the function/ method type
import java.util.*;
public class ArithmecsOperatorDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the  first Number");
        int num1 = in.nextInt();
        System.out.println("Enter the second Number! ");
        int num2 = in.nextInt();
        additionOperator(num1, num2);
        subtractionOperator(num1, num2);
        multiplicationOprater(num1, num2);
        moduloOpretor(num1, num2);
        divisionOperator(num1, num2);


    }
    public static void additionOperator(int num1, int num2){
        System.out.println("This is Addition '+' Operator-------------");
        int add = num1 + num2;
        System.out.println("Your Addition Operation is :"+add);
    }
    public static void subtractionOperator(int num1,int num2){
        System.out.println("This is subtraction '-' Operator!---------");
        System.out.println("Your Subtraction Operation is :"+ (num1 - num2));
    }
    public static void multiplicationOprater(int num1, int num2){
        System.out.println("This is Multiplication * Operator------- ");
        System.out.println("Your Multiplication Operation is :"+(num1 * num2));
    }
    public static void moduloOpretor(int num1, int num2){
        System.out.println("This is Modulo or Reminder '%' Operator------");
        System.out.println("Your Modulo is :"+(num1 % num2));
    }
    public static void divisionOperator(int num1, int num2){
        System.out.println("This is Division Operator!---------------");
        System.out.println("Your Division is :"+(num1 / num2));
    }

}
