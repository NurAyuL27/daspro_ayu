import java.util.Scanner;
public class AplikasiKasirSalon {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        String nmBarang;
        int hrgBarang, jmlBarang;
        double totalHrg, uangDiterima, uangKembalian;

        System.out.printf("Masukkan nama barang yang dibeli : ");
        nmBarang= sc.next();
        System.out.printf("Masukkan harga barang yang dibeli! : ");
        hrgBarang=sc.nextInt();
        System.out.printf("Masukkan jumlah barang yang dibeli! : ");
        jmlBarang=sc.nextInt();
        totalHrg = hrgBarang * jmlBarang;
        System.out.printf("Total harga barang : %f", totalHrg);
        System.out.printf("\nMasukkan jumlah uang yang diterima : ");
        uangDiterima = sc.nextInt();
        uangKembalian = uangDiterima - totalHrg;

        System.out.printf("\nStruk pembelian");
        System.out.printf("\nNama barang : %s", nmBarang);
        System.out.printf("\nHarga barang : %d", hrgBarang);
        System.out.printf("\nJumlah barang : %d", jmlBarang);
        System.out.printf("\nTotal harga : %f", totalHrg);
        System.out.printf("\nUang diterima : %f", uangDiterima);
        System.out.printf("\nUang kembalian anda adalah : %f" ,uangKembalian);
        System.out.printf("\nTerima kasih telah datang disalon kami");
    }
}