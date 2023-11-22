import java.util.Scanner;
public class Kubus21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sisi;
        double luasPermukaan, volume;

         System.out.println("Masukkan sisi");
        sisi = input.nextDouble();

        luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas Permukaan Kubus " + luasPermukaan);

        volume = hitungVolume(sisi);
        System.out.println("Volume Kubus " + volume);
    }

    static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }

    static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }
}