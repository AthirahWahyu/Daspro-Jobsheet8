import java.util.Scanner;

public class PersegiAngka4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;

        do {
            
            System.out.print("Masukkan nilai N (minimal 3): ");
            N = input.nextInt();

            if (N < 3) {
                System.out.println("Nilai N harus minimal 3! Inputkan nilai N lagi yaa ");
                
            }
            
        } while (N < 3);
        // mengatur baris (dari atas ke bawah).
        for (int i = 1; i <= N; i++) {
        // mengatur kolom (dari kiri ke kanan).
            for (int j = 1; j <= N; j++) {
                // menentukan kapan mencetak angka atau spasi.
                // Kondisi   Artinya        Hasil
                // i == 1	Baris pertama	Cetak angka N
                // i == N   Baris terakhir  Cetak angka N
                // j == 1   Kolom pertama   Cetak angka N 
                // j == N   Kolom terakhir  Cetak angka N 
                // selain itu, di tengah persegi mencetak spasi
                if (i == 1 || i == N || j == 1 || j == N ) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            // pindah ke baris berikutnya setelah satu baris selesai.
            System.out.println();
        }
        input.close();
    }    
}
// Baris dulu yang dicetak, tapi kolom terlebih dahulu yang diisi.