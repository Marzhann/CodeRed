import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //shop();

        //EqualOrNot twoNumber = new EqualOrNot();

        //fibonacciSeq(2);

        //fooAndBar();



    }

    static void shop(){
        String item_1_name = "Ice cream";
        String item_2_name = "Banana";

        int item_1_price = 5;
        int item_2_price = 11;

        int item_1_quantity = 25;
        int item_2_quantity = 15;

        int total_cost_item_1 = item_1_quantity * item_1_price;
        int total_cost_item_2 = item_2_quantity * item_2_price;

        System.out.println("Total cost of " + item_1_name + " is " + total_cost_item_1);
        System.out.println("Total cost of " + item_2_name + " is " + total_cost_item_2);

        Scanner coupon = new Scanner(System.in);
        System.out.println("How many % of discount for " + item_1_name + "?");
        double discount = coupon.nextDouble();
        if (0 <= discount && discount <= 100) {
            System.out.println("The discount price for " + item_1_name + " is: " + discount * item_1_price / 100);
        }
        else {
            System.out.println("INVALID COUPON");
        }

        System.out.println("How many % of discount for " + item_2_name + "?");
        double discount_2 = coupon.nextDouble();
        if (0 <= discount_2 && discount_2 <= 100) {
            System.out.println("The price for " + item_1_name + " is: " + discount_2 * item_2_price / 100);
        }
        else{
            System.out.println("INVALID COUPON");
        }
    }

    public static void print_name() {
        Scanner my_input = new Scanner(System.in);
        System.out.println("What is your name?");
        String my_name = my_input.nextLine();
        System.out.println("Your name is: " + my_name);
    }

    static int countLetters(String param){
        int countLetters = param.length();
        return countLetters;
    }

    static String calculator(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter an operation. Options: +; -; *; /.");
        String operation = userInput.nextLine();

        System.out.println("Enter a first operand:");
        int first = userInput.nextInt();

        System.out.println("Enter a second operand");
        int second = userInput.nextInt();

        //System.out.println("Enter an operation. Options: +; -; *; /.");
        //String operation = userInput.nextLine();

        String output = "Result is: ";

        if (operation.equalsIgnoreCase("+")){
            output = output + (first + second);
        } else if (operation.equalsIgnoreCase("-")){
            output = output + (first - second);
        } else if (operation.equalsIgnoreCase("/")){
            output = output + (first / second);
        } else if (operation.equalsIgnoreCase("*")){
            output = output + (first * second);
        } else {
            output = output + "something bad, because you've used non proper operation";
        }

        return output;
    }



    static void fooAndBar() {
        String phrase;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                phrase = "FOO BAR";
            }
            else if (i % 3 == 0){
                phrase = "FOO";
            }
            else if (i % 5 == 0){
                phrase = "BAR";
            }
            else {
                phrase = "";
            }
            System.out.println(i + "\t" + phrase);
        }
    }
}

