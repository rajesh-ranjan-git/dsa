package dev.rajeshranjan.dsa.maths;

import java.util.Scanner;

public class ReverseNumber {
    // Time complexity = O(log N base 10)
    public static void reverse(int num) {
        boolean isNegative = false;

        if (num < 0) {
            isNegative = true;
            num = -num;
        }

        int reverse = 0;

        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        if (isNegative) {
            reverse = -reverse;
        }

        System.out.println("Reversed number: " + reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        reverse(num);
        System.out.println();
    }
}
