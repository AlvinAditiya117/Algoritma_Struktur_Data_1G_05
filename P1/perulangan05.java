package Algoritma_Struktur_Data_1G_05;
import java.util.Scanner;
public class perulangan05 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            int n = nim.charAt(nim.length() - 1) - '0';
        
                if (n < 10) {
                    n += 10;
                }
            System.out.println("n : " + n);
        
                for (int i = 2; i <= n; i++) {
                    if (i == 6 || i == 10) continue;
                    if (i % 2 == 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
        }
    }  