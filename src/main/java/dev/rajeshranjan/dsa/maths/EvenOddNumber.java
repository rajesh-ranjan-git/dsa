package dev.rajeshranjan.dsa.maths;

import java.util.Scanner;

public class EvenOddNumber {
    // Time complexity = O(1)
    public static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.printf("Number %d is even.", num);
        } else {
            System.out.printf("Number %d is odd.", num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        evenOdd(num);
        System.out.println();
    }
}
