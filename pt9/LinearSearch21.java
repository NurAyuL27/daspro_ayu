package pt9;

import java.util.Scanner;

public class LinearSearch21 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int jmlArray, key;
        int hasil = -1;

        System.out.print("Masukkan jumlah elemen array : ");
        jmlArray = sc.nextInt();
        int [] arrayInt = new int [jmlArray];

            for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt [i] = sc.nextInt ();
            }
        
            System.out.print("Masukkan key yang ingin dicari : ");
            key = sc.nextInt();

            for (int i = 0; i < arrayInt.length; i++) {
                if (arrayInt [i] == key) {
                    hasil = i;

                }
            }
            if (hasil != -1) {
                System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
            } else {
                System.out.println("Key tidak ditemukan");
            }
    }
}
