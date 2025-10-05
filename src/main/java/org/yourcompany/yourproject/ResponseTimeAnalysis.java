package org.yourcompany.yourproject;

import java.util.Scanner;

public class ResponseTimeAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int stableCount = 0;
        int warningCount = 0;
        int criticalCount = 0;

        for (int i = 0; i < N; i++) {
            int time = scanner.nextInt();
            
            // Use an if-else if-else structure to categorize
            if (time < 100) {
                stableCount++;
            } else if (time < 200) {
                warningCount++;
            } else {
                criticalCount++;
            }
        }

        System.out.println(stableCount + " " + warningCount + " " + criticalCount);
        scanner.close();
    }
}
