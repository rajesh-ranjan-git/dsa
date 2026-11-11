package dev.rajeshranjan.dsa.maths;

import java.util.Scanner;

public class AppendDigits {
    // Time complexity of Math.pow = O(log digits)
    // Time complexity of digits = O(log num base 10 + 1) -> O(log num base 10)
    // Overall time complexity = O(log(log num base 10))
    public static void appendDigitsAtFront(int num, int digit) {
        if (num == 0) {
            int appendedNum = digit * 10;

            System.out.println("Original Number: " + num);
            System.out.printf("Number after appending digit %d at the front: %d", digit, appendedNum);

            return;
        }

        int originalNum = num;
        boolean isNegative = false;

        if (num < 0) {
            isNegative = true;
            num = -num;
        }

        int noOfDigits = (int) Math.log10(num) + 1;

        int appendedNum = (digit * (int) Math.pow(10, noOfDigits)) + num;

        System.out.println("Original Number: " + originalNum);
        System.out.printf("Number after appending digit %d at the front: %d", digit, isNegative ? -appendedNum : appendedNum);
    }

    // Time complexity = O(1)
    public static void appendDigitsAtEnd(int num, int digit) {
        int originalNum = num;
        boolean isNegative = false;

        if (num < 0) {
            isNegative = true;
            num = -num;
        }

        int appendedNum = (num * 10) + digit;

        System.out.println("Original Number: " + originalNum);
        System.out.printf("Number after appending digit %d at the end: %d", digit, isNegative ? -appendedNum : appendedNum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter digit to append at the end: ");
        int digit = sc.nextInt();

        appendDigitsAtFront(num, digit);
        System.out.println();

        appendDigitsAtEnd(num, digit);
        System.out.println();
    }
}
