// Bitwise Complement (~)
// a = 5 = 0101 (In Binary)
//
//Bitwise Complement Operation of 5
//
//~ 0101
// ________
//  1010  = 10 (In decimal)
public class BitwiseComplementDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }
}
