package org.yourcompany.yourproject;

import java.util.Scanner;

public class PiramidBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = 5;

        // Outer loop for rows
        for (int i = 1; i <= height; i++) {
            // // Inner loop 1: Print leading spaces
            // for (int j = 1; j <= height - i; j++) {
            //     System.out.print(" ");
            // }

            // Inner loop 2: Print the stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next row
        }
    }
}
