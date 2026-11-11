package dev.rajeshranjan.dsa.patternsPrinting.invertedMirroredPatterns;

import java.util.Scanner;

public class InvertedMirroredPatterns {
    public static void invertedRightAngledTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void mirroredRightAngledTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for inverted right angled triangle pattern: ");
        int invertedRows = sc.nextInt();

        invertedRightAngledTriangle(invertedRows);

        System.out.print("Enter number of rows for mirrored right angled triangle pattern: ");
        int mirroredRows = sc.nextInt();

        mirroredRightAngledTriangle(mirroredRows);

        sc.close();
    }
}
