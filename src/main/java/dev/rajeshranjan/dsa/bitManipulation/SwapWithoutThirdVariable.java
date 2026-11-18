package dev.rajeshranjan.dsa.bitManipulation;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void swap(int num1, int num2) {
        System.out.println("num1 before swap: " + num1);
        System.out.println("num2 before swap: " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("num1 after swap: " + num1);
        System.out.println("num2 after swap: " + num2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        swap(num1, num2);
    }
}
