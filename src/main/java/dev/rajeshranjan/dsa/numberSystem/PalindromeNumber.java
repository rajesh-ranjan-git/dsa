package dev.rajeshranjan.dsa.numberSystem;

import java.util.Scanner;

public class PalindromeNumber {
    public static void isPalindromeNumber(int number) {
        int originalNumber = number;
        boolean isNegative = number < 0;

        if (isNegative) {
            number = -number;
        }

        int sum = 0;

        while (number != 0) {
            int rem = number % 10;
            sum = sum * 10 + rem;
            number = number / 10;
        }

        if (isNegative) {
            sum = -sum;
        }

        System.out.printf("%d is %sa Palindrome number.", originalNumber, originalNumber == sum ? "" : "not ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number to check if it is a Palindrome number: ");
        int num = scan.nextInt();

        isPalindromeNumber(num);
    }
}
