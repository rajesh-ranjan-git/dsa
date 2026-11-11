package dev.rajeshranjan.dsa.patternsPrinting.numberCharacterPatterns;

import java.util.Scanner;

public class NumberCharacterPatterns {
    public static void numberRightAngledTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void characterRightAngledTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(j + 65));
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int rows) {
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for number right angled triangle pattern: ");
        int numberRows = sc.nextInt();

        numberRightAngledTriangle(numberRows);

        System.out.print("Enter number of rows for character right angled triangle pattern: ");
        int characterRows = sc.nextInt();

        characterRightAngledTriangle(characterRows);

        System.out.print("Enter number of rows for floyd's triangle pattern: ");
        int floydsRows = sc.nextInt();

        floydsTriangle(floydsRows);

        sc.close();
    }
}
