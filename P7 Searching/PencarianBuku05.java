public class PencarianBuku05 {
    Buku05 listBk[] = new Buku05[5];
    int idx;

    void tambah(Buku05 m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        }else{
            System.out.println("data sudah penuh!");
        }
    }
    void tampil(){
        for (Buku05 m : listBk) {
            m.tampilDataBuku();
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                j = posisi;
                break;
            }
        }
        return posisi;
    }
    public void TampilPosisi(int x,int pos){
        if (pos!= -1) {
            System.out.println("data : "+ x + "ditemukan pada indexs"+ pos);
        }else{
            System.out.println("data : "+ x + "tidak ditemukan");
        }
    }
}
