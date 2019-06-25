package com.ubs;
import java.util.Scanner;


public class Lesson4Arrays {

    public static void main(String[] args){
        //int[] productPrices = collectPrices(5);
        //int averagePrice = averagePrice(productPrices);
        //System.out.println("Average price of your products is: " + averagePrice);

        System.out.println(isPalindrome("ROtor"));
    }

    static int[] collectPrices(int n){
        int[] prices = new int[n];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.println("Please provide price for Product " + (i+1));
            int price = input.nextInt();
            prices[i] = price;
        }
        return prices;
    }

    static int averagePrice(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        int average = sum/arr.length;

        return average;
    }

    public static boolean isPalindrome(String input){
        int iReverse;
        int l = input.length() - 1;

        for(int i = 0; i <= l; i++){
            iReverse = l - i;
            if(input.toLowerCase().charAt(i) == input.toLowerCase().charAt(iReverse)){
                if(i == iReverse){
                    return true;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
