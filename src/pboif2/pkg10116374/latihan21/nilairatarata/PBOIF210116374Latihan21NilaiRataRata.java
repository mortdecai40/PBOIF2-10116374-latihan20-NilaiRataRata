package pboif2.pkg10116374.latihan21.nilairatarata;
import java.util.Scanner;

/** @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk menghitung nilai rata rata
 *
 */
public class PBOIF210116374Latihan21NilaiRataRata {

    public static double rataRataNilai(int banyakMhs, double jumlah){
           double rataNilai = jumlah/banyakMhs;
           return rataNilai;
       }
    public static void main(String[] args) {
        // TODO code application logic here
        int banyakMhs; 
        double nilai, 
               jumlah = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakMhs = keyboard.nextInt();
        for (int i = 1; i <= banyakMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = keyboard.nextInt();
            jumlah += nilai;
        }
        
        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRataNilai(banyakMhs, jumlah));
    }
    
}
