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
    int halaman,stok,harga,hargaTotal;
    double hargaDiskon,hargaBayar;

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

    int gantiHarga(int jml){
        harga = jml;
        return harga;
    }
    int hitungHargaTotal(int jml){
        hargaTotal = harga*jml;
        return hargaTotal;
    }
    double hitungDiskon(){
        if (hargaTotal > 150000) {
            hargaDiskon = hargaTotal*0.12;
            return hargaDiskon;
        } else if (hargaTotal >= 75000) {
            hargaDiskon = hargaTotal*0.05;
            return hargaDiskon; 
        } else [
            hargaDiskon = hargaTotal*0;
            return hargaDiskon; 
        ]
    }
double hitungHargaTotal(){
    hargaBayar = hargaTotal - hargaDiskon;
    return hargaBayar;-
}
    
}
