import java.util.Scanner;
public class Pemilihan2Percobaan221 {
    public static void main(String[] args) {
            Scanner input21 = new Scanner(System.in);
        int sudut1, sudut2, sudut3, totalSudut;

        System.out.println("Masukkan sudut1 :");
        sudut1 = input21.nextInt();
        System.out.println("Masukkan sudut2 :");
        sudut2 = input21.nextInt();
        System.out.println("Masukkan sudut3 :");
        sudut3 = input21.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku"); 
            }
            else{
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
            }
        } else{
            System.out.println("Bukan Segitiga");
        }
    }
}
