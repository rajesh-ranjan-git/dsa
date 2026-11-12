package dev.rajeshranjan.dsa.numberSystem;

import java.util.Scanner;

public class LCM {
    public static void getLCM(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num1 == 0 || num2 == 0) {
            System.out.printf("LCM of %d and %d cannot be calculated as it is undefined.", num1, num2);
            return;
        }

        int result = num1 * num2 / GCDHCF.betterEuclideanAlgorithm(num1, num2);

        System.out.printf("LCM of %d and %d : %d", num1, num2, result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter first number: ");
        int num2 = scan.nextInt();

        getLCM(num1, num2);
    }
}
