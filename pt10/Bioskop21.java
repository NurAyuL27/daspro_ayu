package pt10;
import java.util.Scanner;
public class Bioskop21 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton [0] [0] = "Amin";
        penonton [0] [1] = "Bena";
        penonton [1] [0] = "Candra";
        penonton [1] [1] = "Dela";
        penonton [2] [0] = "Eka";
        penonton [2] [1] = "Farhan";
        penonton [3] [0] = "Gisel";
        penonton [3] [1] = "Hana";

        System.out.println("penonton pada baris ke-3:" ); 
            for (String i : penonton[2]) {
                System.out.println(i);
        }
    }
}
