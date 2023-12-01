import java.util.Scanner;
public class Fibonanci {

    static int hitungJumlahMarmut(int bulan) {

        if (bulan <= 1) {
            return bulan;
        } else {
            int hasil = hitungJumlahMarmut(bulan - 1) + hitungJumlahMarmut(bulan - 2);
            return hasil;
        }
    }

    public static void main(String[] args) {
        int bulan;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah bulan: ");
        bulan = input.nextInt();

        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah: " + hitungJumlahMarmut(bulan));
    }
}
