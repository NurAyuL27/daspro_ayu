import java.util.Scanner;
public class PemilihanPercobaan121 {
    public static void main(String[] args) {
            Scanner input21 = new 
Scanner(System.in);
            String hasil;
        System.out.print("Masukkan angka:  ");
        int angka = input21.nextInt();
        hasil = (angka % 2 == 0)?
"Bilangan Genap" : "Bilangan negatif";
        System.out.println(angka + "adalah " + hasil);
     }
}
