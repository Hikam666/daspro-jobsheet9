import java.util.Scanner;

public class ArrayRataNilai13modif1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0;
        int jumlahlulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                jumlahlulus++;
            }
            total += nilaiMhs[i];
        }

        double rata2 = total / nilaiMhs.length;
        System.out.println("Jumlah mahasiswa: " + nilaiMhs.length);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahlulus);
        System.out.printf("Rata-rata nilai: %.2f\n", rata2);
    }
}