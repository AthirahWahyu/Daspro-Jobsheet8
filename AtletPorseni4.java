import java.util.Scanner;

public class AtletPorseni4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi Variabel 
        int jml;
        String politeknik;
        String tampil = "";
         

        System.out.println("--- EVENT NASIONAL PEKAN OLAHRAGA DAN SENI ---");
        System.out.print("Masukkan jumlah Politeknik yang mendaftar : ");
        jml = input.nextInt();
        input.nextLine();

        // untuk looping banyaknya politeknik 
        for (int i = 0; i < jml; i++) {
        
            System.out.print("Masukkan nama Politeknik ke - " + (i + 1) + " : ");
            politeknik = input.nextLine();
            tampil = tampil + "Nama Politeknik : " + politeknik + "\n";

            System.out.println("--- CABANG OLAHRAGA BADMINTON ---");
            tampil = tampil + "--- CABANG OLAHRAGA BADMINTON ---\n";
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nama atlet cabor badminton ke - " + j + " : ");
                String nama = input.nextLine();
                tampil = tampil + "Nama atlet cabor badminton ke - " + j + ": " + nama + "\n"; 
            }
            System.out.println();
            System.out.println("--- CABANG OLAHRAGA TENIS MEJA ---");
            tampil = tampil + "--- CABANG OLAHRAGA TENIS MEJA ---\n";
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nama atlet tenis meja ke - " + j + " : ");
                String nama = input.nextLine();
                tampil = tampil + "Nama atlet tenis meja ke - " + j + ": " + nama + "\n";
            } 
            System.out.println();
            System.out.println("--- CABANG OLAHRAGA BASKET ---");
            tampil = tampil + "--- CABANG OLAHRAGA BASKET ---\n";
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nama atlet basket ke - " + j + " : ");
                String nama = input.nextLine();
                tampil = tampil + "Nama atlet basket ke - " + j + ": " + nama + "\n";
            }
            System.out.println();
            System.out.println("--- CABANG OLAHRAGA BOLA VOLY ---");
            tampil = tampil + "--- CABANG OLAHRAGA BOLA VOLY ---\n";
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nama atlet bola voly ke - " + j + " : ");
                String nama = input.nextLine();
                tampil = tampil + "Nama atlet bola voly ke - " + j + ": " + nama + "\n";
            }
            tampil = tampil + "\n";
            System.out.println();
        }
        System.out.println("--- INFORMASI NAMA ATLET ---");
        System.out.println(tampil);
        input.close();
    }
}