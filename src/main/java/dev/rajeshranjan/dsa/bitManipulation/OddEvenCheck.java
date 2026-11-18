package dev.rajeshranjan.dsa.bitManipulation;

import java.util.Scanner;

public class OddEvenCheck {
    public static void oddEven(int num) {
        System.out.printf("%d is %s.", num, (num & 1) == 1 ? "odd" : "even");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        oddEven(num);
    }
}
