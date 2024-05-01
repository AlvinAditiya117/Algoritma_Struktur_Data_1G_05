import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Gudang05 gudang = new Gudang05(7);
        Scanner sc05 = new Scanner(System.in);

        boolean ulangi1 = true;
        while (ulangi1) {
            System.out.println("<===( menu )===>");
            System.out.println("1.tambah barang");
            System.out.println("2.ambil barang");
            System.out.println("3.tampilkan tumpukan");
            System.out.println("4.keluar");
            System.out.print("pilih operasi >--> ");
            int pilihan = sc05.nextInt();
            sc05.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("masukkan kode barang : ");
                    int kode = sc05.nextInt();
                    System.out.print("masukkan nama barang : ");
                    String nama = sc05.next();
                    System.out.print("masukkan nama kategori : ");
                    String kategori = sc05.next();
                    Barang05 barangBaru = new Barang05(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    ulangi1 = false;
                    break;
                default:
                    System.out.println("pilihan tidak valid. silakan coba lagi");
            }
        }
    }
}
