//1. Signed Left Shift Operator in Java
//This operator is represented by a symbol <<, read as double less than.
//
//Syntax:
//
//left_operand  <<  number
public class SighnedLeftShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte)(a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }

}
