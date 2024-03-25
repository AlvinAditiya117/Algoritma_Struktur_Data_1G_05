import java.util.Scanner;

public class MainSum05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("Program menghitung keuntungan total perusahaan (satuan juta misal 5.5)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int elm = sc05.nextInt();

        System.out.println("-------------------------------------");
        Sum05[] sm = new Sum05[elm];

        for (int i = 0; i < elm; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            int bln = sc05.nextInt();
            double[] profits = new double[bln];
            for (int j = 0; j < bln; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " (dalam juta): ");
                profits[j] = sc05.nextDouble();
            }
            sm[i] = new Sum05(profits);
            System.out.println();
        }

        for (int i = 0; i < elm; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Total keuntungan: " + sm[i].getTotal());
            System.out.println();
        }
    }
}