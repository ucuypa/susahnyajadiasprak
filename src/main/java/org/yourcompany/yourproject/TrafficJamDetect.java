package org.yourcompany.yourproject;
import java.util.Scanner;

public class TrafficJamDetect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] speeds = new int[N];
        for (int i = 0; i < N; i++) {
            speeds[i] = scanner.nextInt();
        }

        int maxJamLength = 0;
        int currentJamLength = 0;

        for (int speed : speeds) {
            if (speed < 40) {
                currentJamLength++;
            } else {
                if (currentJamLength > maxJamLength) {
                    maxJamLength = currentJamLength;
                }
                currentJamLength = 0;
            }
        }

        // Final check for a jam that ends with the array
        if (currentJamLength > maxJamLength) {
            maxJamLength = currentJamLength;
        }

        System.out.println(maxJamLength);
        scanner.close();
    }
}
