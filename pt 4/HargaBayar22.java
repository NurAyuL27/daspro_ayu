import java.util.Scanner;
public class HargaBayar22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlHalaman, harga, jumlah;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan merk buku yang akan dibeli "); 
        merkBuku=input.nextLine(); 
        System.out.println("Masukkan Jumlah jumlah Halaman buku yang akan dibeli "); 
        jmlHalaman=input.nextInt();
        System.out.println("Masukkan diskon buku: ");
        dis=input.nextDouble();
        System.out.println("Masukkan harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis); 
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}
