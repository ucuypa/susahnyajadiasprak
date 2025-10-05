package org.yourcompany.yourproject;

public class ArrayList {
    public static void main(String[] args) {
        
        int [][] angka = {{1,2}, {3,4}, {5,6}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <2; j++) {
                System.out.println("List Angka Array 2 Dimensi: " + angka[i][j]);
            }
        }
    }
}