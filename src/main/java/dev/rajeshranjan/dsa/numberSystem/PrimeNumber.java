package dev.rajeshranjan.dsa.numberSystem;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {

    public static void isPrimeNumber(int number) {
        int sqrt = (int) Math.sqrt(number);

        boolean isPrime = true;

        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.printf("%d is %sa prime number.", number, isPrime ? "" : "not ");
    }

    public static void sieveOfEratosthenes(int number) {
        int sqrt = (int) Math.sqrt(number);

        boolean[] arr = new boolean[number + 1];
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;

        for (int i = 2; i <= sqrt; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= number; j = j + i) {
                    arr[j] = false;
                }
            }
        }

        System.out.printf("Prime numbers till %d are ", number);

        for (int i = 2; i <= number; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number to check for prime: ");
        int num = scan.nextInt();

        isPrimeNumber(num);

        System.out.println();

        sieveOfEratosthenes(num);
    }
}
