import java.util.Scanner;

public class MainSum05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("program menghitung keuntungan total (satuan juta misal 5.5)");
        System.out.print("masukkan jumlah bulan : ");
        int elm = sc05.nextInt();

        Sum05 sm = new Sum05(elm);
        System.out.println("-------------------------------------");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("masukkan untung bulan ke - "+(i+1)+" = ");
            sm.keuntungan[i] = sc05.nextDouble();
        }
        System.out.println("-------------------------------------");
        System.out.println("ALGORITMA BRUTE FORCE");
        System.out.println("total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println("ALGORITMA DIVIDE CONQUER");
        System.out.println("total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalDC(sm.keuntungan,0,sm.elemen-1));
    }
}
