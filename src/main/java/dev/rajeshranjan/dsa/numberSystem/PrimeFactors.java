package dev.rajeshranjan.dsa.numberSystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PrimeFactors {
    public static void getAllPrimeFactors(int num) {
        int originalNum = num;
        num = Math.abs(num);

        ArrayList<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            while (num % i == 0) {
                primeFactors.add(i);

                num = num / i;
            }
        }

        if (num > 1) primeFactors.add(num);

        System.out.printf("All Prime Factors of %d are ", originalNum);

        for (Integer primeFactor : primeFactors) {
            System.out.print(primeFactor + " ");
        }

        System.out.println();
    }

    public static void getAllUniquePrimeFactors(int num) {
        int originalNum = num;
        num = Math.abs(num);

        HashSet<Integer> primeFactors = new HashSet<>();

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            while (num % i == 0) {
                primeFactors.add(i);

                num = num / i;
            }
        }

        if (num > 1) primeFactors.add(num);

        System.out.printf("All unique Prime Factors of %d are ", originalNum);

        for (Integer primeFactor : primeFactors) {
            System.out.print(primeFactor + " ");
        }

        System.out.println();
    }

    public static void getSmallestPrimeFactor(int num) {
        int originalNum = num;
        num = Math.abs(num);

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.printf("Smallest Prime Factors of %d is %d", originalNum, i);
                System.out.println();
                return;
            }
        }

        System.out.printf("Smallest Prime Factors of %d is %d", originalNum, num);
        System.out.println();
    }

    public static void getAllSmallestPrimeFactorTillNum(int num) {
        num = Math.abs(num);

        int[] prime = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            prime[i] = i;
        }

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (prime[i] == i) {
                for (int j = i * i; j <= num; j = j + i) {
                    if (prime[j] == j) {
                        prime[j] = i;
                    }
                }
            }
        }

        System.out.printf("All Smallest Prime Factors till %d are ", num);

        for (int i = 2; i <= num; i++) {
            System.out.print(prime[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        getAllPrimeFactors(num);
        getAllUniquePrimeFactors(num);

        getSmallestPrimeFactor(num);

        getAllSmallestPrimeFactorTillNum(num);
    }


}
