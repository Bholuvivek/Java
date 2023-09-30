// Increment(++)
// It is used to increment the value of an integer.
// There is two ways for implement
// 1. Pre-increment operator
// 2. Post-increment operator
public class IncrementOperator {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num);  // OutPut 5
        num++;                    // Post Increment
        System.out.println(num);  // OutPut 5+1 = 6
        ++num; // Pre- Increment
        System.out.println(num);  // OutPut 1+6 = 7
        System.out.println(++num);// OutPut 1+7 = 8
    }
}
