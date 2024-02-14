package Algoritma_Struktur_Data_1G_05;
import java.util.Scanner;
public class Fungsi4 {
    
    private static final int NUM_BRANCHES = 4;
    private static final String[] BRANCH_NAMES = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    private static final String[] FLOWER_NAMES = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    private static final int[][] STOCK_FLOWERS = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    private static final int[] FLOWER_PRICES = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < NUM_BRANCHES; i++) {
            int totalRevenue = 0;
            for (int j = 0; j < FLOWER_NAMES.length; j++) {
                totalRevenue += STOCK_FLOWERS[i][j] * FLOWER_PRICES[j];
            }
            System.out.printf("%s: Rp%,d\n", BRANCH_NAMES[i], totalRevenue);
        }

        System.out.println("Stock bunga di RoyalGarden 4:");
        for (int i = 0; i < FLOWER_NAMES.length; i++) {
            System.out.printf("%s: %d\n", FLOWER_NAMES[i], STOCK_FLOWERS[3][i]);
        }

        int aglonemaReduction = 1;
        int keladiReduction = 2;
        int alocasiaReduction = 0;
        int mawarReduction = 5;

        STOCK_FLOWERS[3][0] -= aglonemaReduction;
        STOCK_FLOWERS[3][1] -= keladiReduction;
        STOCK_FLOWERS[3][2] -= alocasiaReduction;
        STOCK_FLOWERS[3][3] -= mawarReduction;

        System.out.println("Stock bunga di RoyalGarden 4 setelah pengurangan:");
        for (int i = 0; i < FLOWER_NAMES.length; i++) {
            System.out.printf("%s: %d\n", FLOWER_NAMES[i], STOCK_FLOWERS[3][i]);
        }
    }
}

