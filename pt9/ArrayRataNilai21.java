package pt9;
import java.util.Scanner;

public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa");
        int jumlahMahasiswa = input21.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

    for (int i = 0; i < jumlahMahasiswa; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
        nilaiMhs [i] = input21.nextInt ();

        if (nilaiMhs[i] > 70) {
            totalLulus += nilaiMhs[i];
            jumlahLulus++;
        } else {
        totalTidakLulus += nilaiMhs[i];
        jumlahTidakLulus++;
    }

    double rataLulus = totalLulus / jumlahLulus;
    double rataTidakLulus = totalTidakLulus / jumlahTidakLulus;

    System.out.println("Rata-rata nilai lulus = " + rataLulus);
    System.out.println("Jumlahh mahasiswa yang tidak lulus = " + rataTidakLulus);
    
        }
    }
}
