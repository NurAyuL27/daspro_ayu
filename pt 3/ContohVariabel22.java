import java.util.Scanner;
public class ContohVariabel22 {

    public static void main(String[] args){
        String BeberapaHobySayaAdalah = "Bermain petak umpet,olahraga,mengaji";
        boolean isPandai = true;
        char jeniskelamin = 'L';
        byte _umurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78; 
        System.out.println(BeberapaHobySayaAdalah);
        System.out.println("Apakkah pandai?" + isPandai);
        System.out.println("Jenis kelamin:" + jeniskelamin); 
        System.out.println("Umurku saat ini: " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, denga tinggi badan %s", $ipk, tinggi));
    }
}
