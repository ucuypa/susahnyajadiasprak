package org.yourcompany.yourproject;

import java.util.Scanner;

public class WarehouseAudit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        int fullyStockedCount = 0;

        for (int i = 0; i < R; i++) {
            boolean isFullyStocked = true;
            for (int j = 0; j < C; j++) {
                int stockCount = scanner.nextInt();
                if (stockCount < 10) {
                    isFullyStocked = false;
                }
            }
            if (isFullyStocked) {
                fullyStockedCount++;
            }
        }

        System.out.println(fullyStockedCount);
        scanner.close();
    }
}
