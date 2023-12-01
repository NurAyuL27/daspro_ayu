import java.util.Scanner;
public class CekPrimaRekursif {

    static boolean cekPrimaRekursif(int n, int i) {
        if (i <= 1) {
            return true; 
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return cekPrimaRekursif(n, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukkan sebuah bilangan: ");
        bilangan = sc.nextInt();

        if (cekPrimaRekursif(bilangan, bilangan / 2)) {
            System.out.println(bilangan + " bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

        sc.close();
    }
}
