package pt7;
import java.util.Scanner;

public class ForKelipatan21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input21.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        System.out.println("Banyaknya bilangan " + kelipatan + " dari 1 sampai 50 adalah " + counter);
        System.out.println("Total bilangan kelipatan " + kelipatan + " dari 1 sampai 50 adalah " + jumlah);
    }
}
