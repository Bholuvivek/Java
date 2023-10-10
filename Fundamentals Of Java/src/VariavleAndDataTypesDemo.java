import java.awt.*;
import java.util.*;
public class VariavleAndDataTypesDemo {
    public static void main(String[] args) {
        // Primitive Data Type
        byte age = 22;
        long price = 202;
        int reg = 88;
        float fee = 10000.00F;
        short year = 4;
        char gender = 'M';
        boolean isValid = true;

        // souot
        System.out.println(age);
        System.out.println(price);
        System.out.println(reg);
        System.out.println(fee);
        System.out.println(year);
        System.out.println(gender);
        System.out.println(isValid);

        // Non Primitives Data Tyoe
         String name = "Vivek Pratp Singh";
        System.out.println(name);
        Date now = new Date();
        System.out.println(now);
        Point point1 = new Point(10,20);
        Point point2 = point1;
        System.out.println("Point x : "+ point2.x);
        System.out.println("Point y : "+ point2.y);
        point2.y = 25;
        System.out.println("Point x : "+ point2.x);
        System.out.println("Point y : "+ point2.y);

    }
}
