package dev.rajeshranjan.dsa.numberSystem;

import java.util.Scanner;

public class Factorial {
    public static void normalFactorial(int num) {
        if (num < 1) {
            System.out.printf("Factorial of %d cannot be calculated", num);
            System.out.println();
            return;
        }

        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        System.out.printf("Factorial of %d is %d", num, result);
        System.out.println();
    }

    public static int recursiveFactorial(int num) {
        if (num < 2) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }

    public static void getTrailingZeroesInFactorial(int num) {
        if (num < 1) {
            System.out.printf("Factorial of %d cannot be calculated", num);
            System.out.println();
            return;
        }

        int result = 0;

        for (int i = 5; i <= num; i = i * 5) {
            result = result + num / i;
        }

        System.out.printf("Trailing zeroes in factorial of %d is %d", num, result);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        normalFactorial(num);

        if (num < 1) {
            System.out.printf("Factorial of %d cannot be calculated", num);
        } else {
            System.out.printf("Factorial of %d is %d", num, recursiveFactorial(num));
        }

        System.out.println();

        getTrailingZeroesInFactorial(num);
    }


}
