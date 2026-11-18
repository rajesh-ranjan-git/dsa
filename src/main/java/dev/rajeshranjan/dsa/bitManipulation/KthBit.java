package dev.rajeshranjan.dsa.bitManipulation;

import java.util.Scanner;

public class KthBit {
    public static void isKthBitSet(int num, int k) {
        System.out.printf("%d%s bit of %d is %s.",
                k, k == 1 ? "st"
                        : k == 2 ? "nd"
                        : k == 3 ? "rd"
                        : "th",
                num, (num & 1 << k) == 0
                        ? "unset" : "set");
        System.out.println();
    }


    public static void setKthBit(int num, int k) {
        System.out.printf("%d after setting %d%s bit is %d.",
                num, k, k == 1 ? "st"
                        : k == 2 ? "nd"
                        : k == 3 ? "rd"
                        : "th",
                (num | (1 << k)));
        System.out.println();
    }

    public static void unsetKthBit(int num, int k) {
        System.out.printf("%d after unsetting %d%s bit is %d.",
                num, k, k == 1 ? "st"
                        : k == 2 ? "nd"
                        : k == 3 ? "rd"
                        : "th",
                (num & (~(1 << k))));
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        System.out.print("Enter bit: ");
        int k = scan.nextInt();

        isKthBitSet(num, k);
        setKthBit(num, k);
        unsetKthBit(num, k);
    }
}
