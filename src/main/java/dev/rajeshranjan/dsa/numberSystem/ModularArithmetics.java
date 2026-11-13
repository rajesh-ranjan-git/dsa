package dev.rajeshranjan.dsa.numberSystem;

import java.util.Scanner;

public class ModularArithmetics {
    public static void wrappedFactorial(int num) {
        if (num < 1) {
            System.out.printf("Factorial of %d cannot be calculated", num);
            System.out.println();
            return;
        }

        int result = 1;

        int m = 10000007;

        for (int i = 1; i <= num; i++) {
            result = (result * i) % m;
        }

        System.out.printf("Factorial of %d is %d", num, result);
        System.out.println();
    }

    public static void printArrayNTimesUsingSingleLoop(int[] arr, int n) {
        for (int i = 0; i < arr.length * n; i++) {
            System.out.print(arr[i % arr.length] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        wrappedFactorial(num);

        int[] arr = {8, 9, 1, 3, 2};

        printArrayNTimesUsingSingleLoop(arr, 5);
    }
}
