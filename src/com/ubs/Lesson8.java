package com.ubs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        int userNumber = 0;
        do {
            System.out.println("Enter a number: ");
            try {
                Scanner userInput = new Scanner(System.in);
                userNumber = userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("It is not a number");
                continue;
            }

            switch (userNumber) {
                case 1:
                    System.out.println("This is number one");
                    break;
                case 2:
                    System.out.println("This is number two");
                    break;
                case 4:
                    System.out.println("Goodbye...");
                    break;
                default:
                    System.out.println("I don't know what is this");
                    break;
            }
        }
        while(userNumber != 4);
    }
}
