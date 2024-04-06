import java.util.Scanner;

public class BukuuMain05 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    PencarianBuku05 data = new PencarianBuku05();
    int jumBuku = 5;

    System.out.println("------------------------------------------------------");
    System.out.println("masukkan data buku secara urut dari kodebuku terkecil : ");
    for (int i = 0; i < jumBuku; i++) {
        System.out.println("------------------------------------------------------");
        System.out.print("kode buku \t: ");
        int kodeBuku = s.nextInt();
        System.out.print("judul buku \t: ");
        String judulBuku = s1.nextLine();
        System.out.print("tahun terbit \t: ");
        int tahunTerbit = s.nextInt();
        System.out.print("pengarang \t: ");
        String pengarang = s1.nextLine();
        System.out.print("stock\t\t: ");
        int stock = s.nextInt();

        Bukuu05 m = new Bukuu05(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
        data.tambah(m);
    }
    System.out.println("------------------------------------------------------");
    System.out.println("data keseluruhan mahasiswa");
    System.out.println("------------------------------------------------------");
    System.out.println("data keseluruhan buku");
    data.tampil();
    System.out.println("______________________________________________________");
    System.out.println("______________________________________________________");
    System.out.println("pencarian data");
    System.out.println("masukkan kode buku yang dicari");
    System.out.print("kode buku : ");
    int cari = s.nextInt();
    System.out.println("menggunakan sequatial serach");
    int posisi = data.FindSeqSearch(cari);
    data.TampilPosisi(cari ,posisi );
    data.TampilData(cari ,posisi );
    System.out.println("menggunakan binary search");
    posisi = data.FindBinarySearch(cari, 0, jumBuku -1);
    data.TampilPosisi(cari, posisi);
    data.TampilData(cari, posisi);
    Bukuu05 dataBuku = data.FindBuku(cari);
    dataBuku.tampilDataBuku();
    }
}
