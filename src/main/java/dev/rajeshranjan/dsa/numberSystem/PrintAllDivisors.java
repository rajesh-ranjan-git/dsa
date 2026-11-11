package dev.rajeshranjan.dsa.numberSystem;

import java.util.Scanner;

public class PrintAllDivisors {

    public static void printAllDivisors(int number) {
        int sqrt = (int) Math.sqrt(number);

        System.out.printf("Divisors of %d are: ", number);

        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");

                if (number / i != i) {
                    System.out.print(number / i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        printAllDivisors(num);
    }
}
