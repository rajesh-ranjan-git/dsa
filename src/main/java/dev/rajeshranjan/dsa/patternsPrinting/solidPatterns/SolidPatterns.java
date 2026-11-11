package dev.rajeshranjan.dsa.patternsPrinting.solidPatterns;

import java.util.Scanner;

public class SolidPatterns {
    public static void square(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightAngledTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for square pattern: ");
        int squareRows = sc.nextInt();
        System.out.print("Enter number of columns for square pattern: ");
        int squareColumns = sc.nextInt();

        square(squareRows, squareColumns);

        System.out.print("Enter number of rows for right angled triangle pattern: ");
        int rightAngledTriangleRows = sc.nextInt();

        rightAngledTriangle(rightAngledTriangleRows);

        sc.close();
    }
}
