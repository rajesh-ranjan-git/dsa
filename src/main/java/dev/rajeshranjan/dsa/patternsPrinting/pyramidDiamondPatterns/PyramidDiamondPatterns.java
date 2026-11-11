package dev.rajeshranjan.dsa.patternsPrinting.pyramidDiamondPatterns;

import java.util.Scanner;

public class PyramidDiamondPatterns {
    public static void pyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int l = 1; l <= i - 1; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void diamond(int rows) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = rows - 1; i >= 1; i--) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for pyramid pattern: ");
        int pyramidRows = sc.nextInt();

        pyramid(pyramidRows);

        System.out.print("Enter number of rows for diamond pattern: ");
        int diamondRows = sc.nextInt();

        diamond(diamondRows);

        sc.close();
    }
}
