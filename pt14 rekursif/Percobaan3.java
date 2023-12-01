import java.util.Scanner;
public class Percobaan3 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return (0.117 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc.nextDouble();
        System.out.print("Lamanya investasi (tahun): ");
        tahun = sc.nextInt();

        System.out.println("Jumlah saldo setelah " + tahun + " tahun: " + hitungLaba(saldoAwal, tahun));

        sc.close();

    }
}