/**
 * Buku05
 */
public class Buku05 {

    public Buku05(){
 
    }

    public Buku05(String jud, String pg,int hal,int stok,int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    
    String judul,pengarang;
    int halaman,stok,harga;

    void tampillkanInformasi() {
        System.out.println("judul : "+ judul);
        System.out.println("pengarang : "+ halaman);
        System.out.println("jumlah halaman : "+ halaman);
        System.out.println("sisa stk : "+ stok);
        System.out.println("harga : Rp "+ harga);
    }

    void terjual(int jml) {
        if (stok >= jml) {
         stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int jml){
        harga = jml;
    }
}