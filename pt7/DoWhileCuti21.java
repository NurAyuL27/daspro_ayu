package pt7;
import java.util.Scanner;

public class DoWhileCuti21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = input21.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input21.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = input21.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    System.out.print("Apakah Anda ingin mencoba lagi (y/t) ? ");
                    konfirmasi = input21.next();
                    if (konfirmasi.equalsIgnoreCase("t"))  {
                    break;
                    }
                }
            }
        } while (jatahCuti > 0);
    }
}
