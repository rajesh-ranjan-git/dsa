package dev.rajeshranjan.dsa.numberSystem;

import java.util.Scanner;

public class GCDHCF {

    public static void getGCDHCF(int num1, int num2) {
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

        System.out.println("GCD = " + ans);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        getGCDHCF(num1, num2);
    }
}
