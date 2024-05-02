import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("pilih menu");
        System.out.println("1. antrian baru");
        System.out.println("2. antiran lama");
        System.out.println("3. cek antrian terdepan");
        System.out.println("4. cek semua antrian");
    }

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("masukan kapsitas queue : ");
        int jumlah = sc05.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc05.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("no rekening : ");
                    String norek = sc05.next();
                    System.out.print("nama : ");
                    String nama = sc05.next();
                    System.out.print("alamat : ");
                    String alamat = sc05.next();
                    System.out.print("umur : ");
                    int umur = sc05.nextInt();
                    System.out.print("saldo : ");
                    double saldo = sc05.nextDouble();
                    Nasabah05 nb = new Nasabah05(norek, nama, alamat, umur, saldo);
                    sc05.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah05 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) &&  !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0) {
                    System.out.println("antrian yang keluar : "+ data.norek + " " + data.nama + " " +  data.alamat + " " +  data.umur + " " +  data.saldo);
                    break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                    }
            }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        }
}
