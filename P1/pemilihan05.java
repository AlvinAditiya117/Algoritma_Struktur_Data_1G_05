package Algoritma_Struktur_Data_1G_05;
import java.util.Scanner;
public class pemilihan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("====================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextInt();

        System.out.println("====================");
        System.out.println("====================");

        int hitungNilai=0;
        if ((tugas >= 0 && tugas <= 100) && (kuis >= 0 && kuis <= 100) && (uts >= 0 && uts <= 100) && (uas >= 0 && uas <= 100)) {
            hitungNilai = (int)((tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3));
            System.out.println("Nilai Akhir : " + hitungNilai);

            if (hitungNilai > 80 && hitungNilai <= 100) {
                System.out.println("Nilai Huruf : A");
            } else if (hitungNilai > 73 && hitungNilai <= 80){
                System.out.println("Nilai Huruf : B+");
            } else if (hitungNilai > 65 && hitungNilai <= 73){
                System.out.println("Nilai Huruf : B");
            } else if (hitungNilai > 60 && hitungNilai <= 65){
                System.out.println("Nilai Huruf : C+");    
            } else if (hitungNilai > 50 && hitungNilai <= 60){
                System.out.println("Nilai Huruf : C");
            } else if (hitungNilai > 39 && hitungNilai <= 50){
                System.out.println("Nilai Huruf : D");
            } else {System.out.println("Nilai Huruf : E");
            }  
        }
        System.out.println("====================");
        System.out.println("===================="); 
        if (hitungNilai > 50 && hitungNilai <= 100) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }
    }
}