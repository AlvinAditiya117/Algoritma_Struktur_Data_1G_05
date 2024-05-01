import java.util.Scanner;

public class QueueMain05 {
    public static void menu() {
        System.out.println("masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. print");
        System.out.println("4. peek");
        System.err.println("5. clear");
        System.out.println("-----------------------------------");
    }    
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.print("masukkan kapasitas queue : ");
        int n = sc05.nextInt();
        Queue05 Q = new Queue05(n);
        int pilih;

        do{
            menu();
            pilih = sc05.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("masukkan data baru");
                    int dataMasuk = sc05.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                    System.out.println("data yang dikeluarkan : "+ dataKeluar);
                    break;
                }
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3|| pilih == 4 || pilih == 5 );
    }
}
