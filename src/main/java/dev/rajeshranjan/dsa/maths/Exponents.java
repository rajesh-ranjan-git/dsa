package dev.rajeshranjan.dsa.maths;

import java.util.Scanner;

public class Exponents {
    // Time complexity = O(N)
    public static void power(int num, int pow) {
        int originalPow = pow;
        double res = 1;
        boolean isNegative = false;

        if (pow < 0) {
            isNegative = true;
            pow = -pow;
        }

        while (pow > 0) {
            res *= num;
            pow--;
        }

        System.out.printf("%d raised to the power %d is %f.", num, originalPow, isNegative ? 1 / res : res);
    }

    // Time Complexity = O(log pow base 2)
    public static void fastExponentiation(int num, int pow) {
        int originalNum = num;
        int originalPow = pow;
        double res = 1;
        boolean isNegative = false;

        if (pow < 0) {
            isNegative = true;
            pow = -pow;
        }

        while (pow > 0) {
            if (pow % 2 != 0) {
                res *= num;
                pow--;
            }

            pow /= 2;
            num = num * num;
        }

        System.out.printf("%d raised to the power %d is %f by fast exponentiation method.", originalNum, originalPow, isNegative ? 1 / res : res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter power: ");
        int pow = sc.nextInt();

        power(num, pow);
        System.out.println();

        fastExponentiation(num, pow);
        System.out.println();
    }
}
