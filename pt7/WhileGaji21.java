package pt7;
import java.util.Scanner;

public class WhileGaji21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input21.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            String jabatan = input21.next();

            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input21.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan invalid");
                i--;
                continue;
            }
            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}
