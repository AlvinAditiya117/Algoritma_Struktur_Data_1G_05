
public class BukuMain05 {
    public static void main(String[] args) {
    Buku05 bk1 = new Buku05();
    bk1.judul = "Today Ends Tomorrow Come";
    bk1.pengarang = " Denanda Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 4;
    bk1.harga = 71000;

    bk1.tampillkanInformasi();
    bk1.terjual(5);
    bk1.gantiHarga(60000);
    bk1.tampillkanInformasi();


    Buku05 bk2 = new Buku05("Self Reward","Maheera Ayesha",160,29,59000);
    bk2.terjual(11);
    bk2.tampillkanInformasi();

    Buku05 bukuAlvin = new Buku05("Indah Pada Waktunya","Alvin",179,31,60000);
    bukuAlvin.terjual(11);
    bukuAlvin.tampillkanInformasi();

    
    }
}
