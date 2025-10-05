package org.yourcompany.yourproject;
import java.util.Scanner;

public class LatihanLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height = 5;
        
        for(int i = 1; i <= height;i++) {
            for (int j = 1; j <= i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
