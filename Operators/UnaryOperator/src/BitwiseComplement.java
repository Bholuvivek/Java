//This unary operator returns the one’s complement representation of
// the input value or operand, i.e, with all bits inverted,
// which means it makes every 0 to 1, and every 1 to 0.
// ~(operand)
public class BitwiseComplement {
    public static void main(String[] args) {
        int num1 = 6; int num2 = 2;
        System.out.println(num1 + "'s bitwise complement = " + ~num1);
        System.out.println(num2 + "'s bitwise complement = " + ~num2);
    }
}
