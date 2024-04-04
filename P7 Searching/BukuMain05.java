import java.util.Scanner;

public class BukuMain05 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    PencarianBuku05 data = new PencarianBuku05();
    int jumBuku = 5;

    System.out.println("------------------------------------------------------");
    System.out.println("masukkan data bku secara urut dari kodebuku terkecil : ");
    for (int i = 0; i < jumBuku; i++) {
        System.out.println("------------------------");
        System.out.println("kode buku \t:");
        int kodeBuku = s.nextInt();
        System.out.println("jumlah buku \t: ");
        String judulBuku = s1.nextLine();
        System.out.println("tahun terbit \t: ");
        int tahunTerbit = s.nextInt();
        System.out.println("pengarang \t: ");
        String pengarang = s1.nextLine();
        System.out.println("stock \t: ");
        int stock = s.nextInt();

        Buku05 m = new Buku05(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
        data.tambah(m);
    }
    System.out.println("---------------------------------------------------");
    System.out.println("data keseluruhan mahasiswa");
    System.out.println("------------------------------------------------");
    System.out.println("data keseluruhan buku");
    data.tampil();
    System.out.println("___________________________________________________");
    System.out.println("___________________________________________________");
    System.out.println("pencarian data : ");
    System.out.println("masukkan kode buku yang dicai : ");
    System.out.println("kode buku : ");
    int cari = s.nextInt();
    System.out.println("menggunakan sequatial serach");
    int posisi = data.FindSeqSearch(cari);
    data.TampilPosisi(cari, posisi);
    }
}
