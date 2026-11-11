package dev.rajeshranjan.dsa.maths;

import java.util.Scanner;

public class NoOfDigits {
    // No. of Digits = (log N base 10) + 1
    // Time complexity = O(log N base 10)
    public static void noOfDigitsUsingFormula(int num) {
        if (num == 0) {
            System.out.printf("No. of digits in %d using formula: %d", num, 1);
            return;
        }

        int originalNum = num;

        if (num < 0) {
            num = -num;
        }

        int digits = ((int) Math.log10(num)) + 1;

        System.out.printf("No. of digits in %d using formula: %d", originalNum, digits);
    }

    // Time complexity = O(log N base 10) -> (num is divided by 10)
    public static void noOfDigits(int num) {
        if (num == 0) {
            System.out.printf("No. of digits in %d: %d", num, 1);
            return;
        }

        int digits = 0;

        int originalNum = num;

        if (num < 0) {
            num = -num;
        }

        while (num != 0) {
            num /= 10;

            digits++;
        }

        System.out.printf("No. of digits in %d: %d", originalNum, digits);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        noOfDigitsUsingFormula(num);
        System.out.println();

        noOfDigits(num);
        System.out.println();
    }
}
