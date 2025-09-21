package org.yourcompany.yourproject;

import java.util.Scanner;

public class AkbarTakjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of recipients and the quantity of takjil
        long takjilQuantity = input.nextLong();
        long recipients = input.nextLong();

        // Calculate the leftover takjil
        long leftover = takjilQuantity % recipients;

        // Display the result
        System.out.println("Akbar's takjil Leftover : " + leftover);

        // Close the input
     input.close();
    }
}

