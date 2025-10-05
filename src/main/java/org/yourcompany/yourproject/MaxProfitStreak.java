package org.yourcompany.yourproject;

import java.util.Scanner;

public class MaxProfitStreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int maxSoFar = 0;
        int currentMax = 0;

        for (int i = 0; i < N; i++) {
            int profit = scanner.nextInt();
            currentMax += profit;

            // If currentMax is negative, it won't contribute positively
            // to any future subarray, so we reset.
            if (currentMax < 0) {
                currentMax = 0;
            }

            // Update the global maximum if the current streak is larger.
            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
        }

        System.out.println(maxSoFar);
        scanner.close();
    }
}
