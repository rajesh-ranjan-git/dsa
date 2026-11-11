package dev.rajeshranjan.dsa.numberSystem;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void isArmstrongNumber(int number) {
        int originalNumber = number;
        boolean isNegative = number < 0;

        if (isNegative) {
            number = -number;
        }

        int digits = (int) Math.log10(number) + 1;
        int sum = 0;

        while (number != 0) {
            int rem = number % 10;
            sum += (int) Math.pow(rem, digits);
            number = number / 10;
        }

        if (isNegative) {
            sum = -sum;
        }

        System.out.printf("%d is %san Armstrong number.", originalNumber, originalNumber == sum ? "" : "not ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number to check if it is an Armstrong number: ");
        int num = scan.nextInt();

        isArmstrongNumber(num);
    }
}
