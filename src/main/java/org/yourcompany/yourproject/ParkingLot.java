package org.yourcompany.yourproject;

import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions R and C
        int R = scanner.nextInt();
        int C = scanner.nextInt();

        int maxCarsFound = -1;
        int resultRowIndex = -1;

        // Loop through each row
        for (int i = 0; i < R; i++) {
            int currentRowCars = 0;
            // Loop through each column in the current row
            for (int j = 0; j < C; j++) {
                int spot = scanner.nextInt();
                if (spot == 1) {
                    currentRowCars++;
                }
            }
            
            // Check if the current row is the new maximum
            if (currentRowCars > maxCarsFound) {
                maxCarsFound = currentRowCars;
                resultRowIndex = i;
            }
        }

        // Print the final result
        System.out.println(resultRowIndex);

        scanner.close();
    }
}