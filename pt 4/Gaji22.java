import java.util.Scanner;
public class Gaji22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    int jmlMasuk, JmlTdkMasuk, TotGaji;
    int gaji, potGaji;

    System.out.println("masukkan gaji ");
    gaji=input.nextInt();
    System.out.println("Masukkan potongan gaji ");
    potGaji=input.nextInt();
    System.out.println("masukkan Jumlah Hari Masuk Kerja Anda ");
    jmlMasuk=input.nextInt();
    System.out.println("Masukkan Jmlah Hari Tidak Masuk Anda ");
    JmlTdkMasuk=input.nextInt();

    TotGaji = (jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
    System.out.println("Gaji yang anda terima adalah " +TotGaji);
    }
 }