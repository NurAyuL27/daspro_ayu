import java.util.Scanner;
public class PenjumlahanRekursif {

    public static int penjumlahanRekursif(int n, int f) {
        if (n == f) {
            return n;
        } else { 
            return n + penjumlahanRekursif(n + 1, f);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, i, n = 1, hasil;
        System.out.print("Masukkan nilai f : ");
        f = sc.nextInt();

        System.out.print("Hasil penjumlahan 1-" + f + ": ");
        for (i = 1; i <= f; i++) {
            System.out.print(i + " + ");
        }
        System.out.print(" : ");
        hasil = penjumlahanRekursif(n, f);
        System.out.print(hasil);
        
    }
}