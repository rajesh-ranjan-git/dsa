package dev.rajeshranjan.dsa.numberSystem;

import java.util.Objects;
import java.util.Scanner;

public class NumberSystemConversion {
    public static String getNumberSystemIdentifier(int base) {
        return switch (base) {
            case 2 -> "Binary";
            case 8 -> "Octal";
            case 10 -> "Decimal";
            case 16 -> "Hexadecimal";
            default -> "Unkown";
        };
    }

    public static char getRemainder(int remainder) {
        return switch (remainder) {
            case 10 -> 'A';
            case 11 -> 'B';
            case 12 -> 'C';
            case 13 -> 'D';
            case 14 -> 'E';
            case 15 -> 'F';
            default -> (char) remainder;
        };
    }

    public static int getDigit(char num) {
        return switch (num) {
            case 'A' -> 10;
            case 'B' -> 11;
            case 'C' -> 12;
            case 'D' -> 13;
            case 'E' -> 14;
            case 'F' -> 15;
            default -> (int) num - (int) '0';
        };
    }

    public static void decimalToAny(int num, int base) {
        if (num == 0) {
            System.out.printf("%s of %d is %s.\n", getNumberSystemIdentifier(base), num, num);
            return;
        }

        StringBuilder sb = new StringBuilder();
        int originalNum = num;

        while (num != 0) {
            int remainder = num % base;

            if (base == 16 && remainder >= 10) {
                sb.append(getRemainder(remainder));
            } else {
                sb.append(remainder);
            }

            num /= base;
        }

        System.out.printf("%s of %d is %s.\n", getNumberSystemIdentifier(base), originalNum, sb.reverse());
    }

    public static void anyToDecimal(String num, int base) {
        if (Objects.equals(num, "0")) {
            System.out.printf("%s of %s is %s.\n", getNumberSystemIdentifier(base), num, num);
            return;
        }

        int pos = 0;
        int res = 0;

        for (int i = num.length() - 1; i >= 0; i--) {
            res += getDigit(num.charAt(i)) * (int) Math.pow(base, pos);

            pos++;
        }

        System.out.printf("%s of %s is %s.\n", getNumberSystemIdentifier(base), num, res);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int decimalNUm = scan.nextInt();

        System.out.print("Enter base to convert to from decimal: ");
        int toBase = scan.nextInt();

        decimalToAny(decimalNUm, toBase);

        System.out.print("Enter any non-decimal number: ");
        String num = scan.next();

        System.out.print("Enter base to convert from to decimal: ");
        int fromBase = scan.nextInt();

        anyToDecimal(num, fromBase);
    }
}
