public class Gudang05 {
    Barang05[] tumpukan;
    int size;
    int top;

    public Gudang05(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang05[size];
        top  = -1;
    }
    public boolean cekKosong(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }
    public boolean cekPenuh(){
        if (top == size -1) {
            return true;
        }else{
            return false;
        }
    }
    public void tambahBarang(Barang05 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambah kegudang");
        }else{
            System.out.println("gagal!! tumpukan barang digudang sudah penuh");
        }
    }
    public Barang05 ambilBarang(){
        if(!cekKosong()){
            Barang05 delete = tumpukan[top];
            top--;
            System.out.println("barang "+delete.nama+" diambil dari gudang");
            return delete;
        }else{
            System.out.println("tumpukan barang kosong");
            return null;
        }
    }
    public Barang05 lihatBarangTeratas(){
        if (top== size-1) {
            Barang05 barangTeratas = tumpukan[top];
            top--;
            System.out.println("barang teratas "+barangTeratas.nama);
            return barangTeratas;
        }else{
            System.out.println("tumpukan barang kosong");
            return null;
        }
    }
    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("rincian tupukkan barang digudang");
            for (int i = 0; i <= top; i++){
                System.out.printf("kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,tumpukan[i].kategori);
            }
        }else{
            System.out.println("tumpukan barang kosong");
        }
    }

}
