/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.util.Scanner;

/**
 *
 * @author ucupo
 */
public class FilkomCinema {

    public static void main(String[] args) {
        //Instansiasi Scanner
        Scanner input = new Scanner(System.in);

        //Deklarasi Variable
        String movieTitle = "";
        int moviePrice = 0;
        
        //Movie Choices
        System.out.println("List of Movies Currently Airing");
        System.out.println("1. Siksa Pemrograman Dasar (Rp50.000,00)");
        System.out.println("2. Bahagianya Ketika Laporan Sudah Selesai (Rp.40.000,00)");
        System.out.println("3. Sore: Istri Dari Masa Depan (Rp30.000,00)");

        //Input 
        int pilihan = input.nextInt();
        int hargaBayar = input.nextInt();

        input.close();
        //Selection Condition
        if (pilihan < 4 ) {
            if (pilihan == 1) {
                movieTitle = "Siksa Pemrograman Dasar";
                moviePrice = 50000;
                System.out.println("Anda telah memesan tiket untuk film " + movieTitle);
                System.out.println("Total Biaya: " + moviePrice);
                System.out.println("Uang Yang Anda Bayarkan: " + hargaBayar);
                System.out.println("Uang Kembalian Anda: " + (hargaBayar - moviePrice));
            } else if (pilihan == 2) {
                movieTitle = "Bahagianya Ketika Laporan Sudah Selesai";
                moviePrice = 50000;
                System.out.println("Anda telah memesan tiket untuk film " + movieTitle);
                System.out.println("Total Biaya: " + moviePrice);
                System.out.println("Uang Yang Anda Bayarkan: " + hargaBayar);
                System.out.println("Uang Kembalian Anda: " + (hargaBayar - moviePrice));
            } else if (pilihan == 3) {
                movieTitle = "Bahagianya Ketika Laporan Sudah Selesai";
                moviePrice = 50000;
                System.out.println("Anda telah memesan tiket untuk film " + movieTitle);
                System.out.println("Total Biaya: " + moviePrice);
                System.out.println("Uang Yang Anda Bayarkan: " + hargaBayar);
                System.out.println("Uang Kembalian Anda: " + (hargaBayar - moviePrice));
            } else {

            }
        } else {
            System.out.println("Pilihan film tidak valid");
            System.out.println("Silakan pilih antara 1, 2, atau 3");
        }
    }
}
