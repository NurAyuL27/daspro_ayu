package pt9;

import java.util.Scanner;

public class Tugas21 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int n = input.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

         int nilaiTertinggi = nilai[0];
         int nilaiTerendah = nilai[0];
         int total = nilai[0];
 
         for (int i = 1; i < n; i++) {
             if (nilai[i] > nilaiTertinggi) {
                 nilaiTertinggi = nilai[i];
             }
             if (nilai[i] < nilaiTerendah) {
                 nilaiTerendah = nilai[i];
             }
             total += nilai[i];
         }
 
         double rataRata = (double) total / n;
 
         System.out.println("Nilai tertinggi: " + nilaiTertinggi);
         System.out.println("Nilai terendah: " + nilaiTerendah);
         System.out.println("Nilai rata-rata: " + rataRata);
    }
 }
    
