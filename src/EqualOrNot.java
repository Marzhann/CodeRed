import java.util.Scanner;
//check
public class EqualOrNot {
    //constractor
    public EqualOrNot() {
        System.out.println("First number: ");
        Scanner input = new Scanner(System.in);
        int fNumber = input.nextInt();

        System.out.println("Second number: ");
        Scanner input_2 = new Scanner(System.in);
        int sNumber = input_2.nextInt();

        if (fNumber == sNumber) {
            System.out.println("EQUAL");
        }
        else if (fNumber > sNumber) {
            System.out.println("FIRST NUMBER IS GREATER");
        }
        else if (fNumber < sNumber) {
            System.out.println("SECOND NUMBER IS GREATER");
        }
    }
}
