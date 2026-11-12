package dev.rajeshranjan.dsa.numberSystem;

import java.util.Scanner;

public class GCDHCF {

    public static void normalGCDHCF(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num1 == 0 && num2 == 0) {
            System.out.println("GCD = " + 0);
            return;
        }

        if (num1 == 0) {
            System.out.println("GCD = " + num2);
            return;
        }

        if (num2 == 0) {
            System.out.println("GCD = " + num1);
            return;
        }

        int ans = 1;

        for (int i = 2; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }

        System.out.println("GCD using normal method = " + ans);
    }

    public static int euclideanAlgorithm(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num2 > num1) {
            return euclideanAlgorithm(num2, num1);
        }

        if (num2 > 0) {
            return euclideanAlgorithm(num1 - num2, num2);
        }

        return num1;
    }

    public static int betterEuclideanAlgorithm(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num2 > num1) {
            return betterEuclideanAlgorithm(num2, num1);
        }

        while (num2 > 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }

        return num1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        normalGCDHCF(num1, num2);

        System.out.println("GCD using Euclidean Algorithm = " + euclideanAlgorithm(num1, num2));

        System.out.println("GCD using better Euclidean Algorithm = " + betterEuclideanAlgorithm(num1, num2));
    }
}
