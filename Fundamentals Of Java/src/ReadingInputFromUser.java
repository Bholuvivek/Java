import java.util.*
;public class ReadingInputFromUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = in.nextLine();
        System.out.println("Enter Your Age : ");
        int age = in.nextInt();
        System.out.println("Enter Your Gender (M/F) :");
        char gender = in.next().charAt(0);
        System.out.println("Enter Your Contact Number : ");
        double contact = in.nextDouble();
        System.out.println();
        System.out.println("User Details : ");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Contact Number : "+ contact);
        System.out.println("Gender : "+gender);

    }
}
