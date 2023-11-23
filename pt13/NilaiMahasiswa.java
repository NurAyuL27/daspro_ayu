import java.util.Scanner;
public class NilaiMahasiswa {
    static String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    static int[][] nilaiTugas = new int[5][7];
    public static void main(String[] args) {
        inputData();
        tampilkanNilai();
        int mingguTertinggi = cariMingguTertinggi();
        System.out.println("Pada minggu ke-" + mingguTertinggi + " terdapat nilai tertinggi dibanding minggu lain.");
        tampilkanMahasiswaTertinggi(mingguTertinggi);
    }
    static void inputData() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan nilai tugas untuk " + mahasiswa[i] + ":");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                nilaiTugas[i][j] = input.nextInt();
            }
        }
    }
    static void tampilkanNilai() {
        System.out.println("Nilai Tugas Mahasiswa:");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(mahasiswa[i] + ": ");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print(nilaiTugas[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int cariMingguTertinggi() {
        int mingguTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int j = 0; j < nilaiTugas[0].length; j++) {
            int totalNilaiMinggu = 0;
            for (int i = 0; i < mahasiswa.length; i++) {
                totalNilaiMinggu += nilaiTugas[i][j];
            }
            if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                mingguTertinggi = j + 1;
            }
        }
        return mingguTertinggi;
    }
    static void tampilkanMahasiswaTertinggi(int minggu) {
        System.out.println("\nMahasiswa dengan Nilai Tertinggi pada Minggu ke-" + minggu + ":");
        int nilaiTertinggi = 0;
        String mahasiswaTertinggi = "";
        for (int i = 0; i < mahasiswa.length; i++) {
            if (nilaiTugas[i][minggu - 1] > nilaiTertinggi) {
                nilaiTertinggi = nilaiTugas[i][minggu - 1];
                mahasiswaTertinggi = mahasiswa[i];
            }
        }
        System.out.println("Nama Mahasiswa: " + mahasiswaTertinggi);
        System.out.println("Nilai: " + nilaiTertinggi);
    }
}

