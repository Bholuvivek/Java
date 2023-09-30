//Logical Operator
// This is  used to perform logical “AND”, “OR” and “NOT” operations,
// i.e. the function similar to AND gate and OR gate in digital electronics.
//  These are the Logical Operators
//  AND Operator ( && ) – if( a && b ) [if true execute else don’t]
//  OR Operator ( || ) – if( a || b) [if one of them is true to execute else don’t]
//  NOT Operator ( ! ) – !(a<b) [returns false if a is smaller than b]


public class LogicalOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 90;
        logicalAndOperator(a,b,c);
        logicalOROperator(a,b,c);
        logicalNotOperator(a,b,c);
    }
    public static void logicalAndOperator(int a, int b, int c){
        if(a > b && a > c){
            System.out.println("A is Greater");
        }
        else if (b > a && b > c) {
            System.out.println("B is Greater");
        }
        else{
            System.out.println("C is Greater ");
        }
    }
    public static void logicalOROperator(int a, int b, int c){
        if ((a > b) || (a > c)){
            System.out.println(a+b+c);
        }
        else {
            System.out.println(a+b+c);
        }
    }
    public static void logicalNotOperator(int a, int b, int c){
        System.out.println((a+b) != c);
        System.out.println((a+b)!= (b+c));
    }
}