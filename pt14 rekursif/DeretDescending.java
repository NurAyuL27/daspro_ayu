import java.util.Scanner;
public class DeretDescending {

    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        System.out.print("Deret Rekursif: ");
        deretDescendingRekursif(n);
        System.out.println();

        System.out.print("Deret Iteratif: ");
        deretDescendingIteratif(n);

        sc.close();
    }
}
