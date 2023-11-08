package pt11;
import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
                    System.out.print(n + " ");
                } else {
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
