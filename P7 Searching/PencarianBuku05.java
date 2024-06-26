public class PencarianBuku05 {
    Bukuu05 listBk[] = new Bukuu05[5];
    int idx;

    void tambah(Bukuu05 m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        }else{
            System.out.println("data sudah penuh!");
        }
    }
    void tampil(){
        for (Bukuu05 m : listBk) {
            m.tampilDataBuku();
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void TampilPosisi(int x,int pos){
        if (pos!= -1) {
            System.out.println("data : "+ x + " ditemukan pada indexs "+ pos);
        }else{
            System.out.println("data : "+ x + " tidak ditemukan ");
        }
    }
    public void TampilData(int x,int pos){
        if (pos!=-1) {
            System.out.println("kode buku \t : "+ x);
            System.out.println("judul \t\t : "+ listBk[pos].judulBuku);
            System.out.println("tahun terbit \t : "+ listBk[pos].tahunTerbit);
            System.out.println("pengarang \t : "+ listBk[pos].pengarang);
            System.out.println("stock \t\t : "+ listBk[pos].stock);
        }else{
            System.out.println("data : "+ x + " tidak ditemukan ");        
        }
    }
    public Bukuu05 FindBuku(int cari){
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                return listBk[j];
            }
        }
        return null;
    }
    public int FindBinarySearch(int cari, int left,int right){
        int mid;
        if (right >= left) {
            mid = (right + left)/2;
            if (cari == listBk[mid].kodeBuku) {
                return(mid);
            }else if (listBk[mid].kodeBuku < cari) {
                return FindBinarySearch(cari, left, mid -1);
            }else{
                return FindBinarySearch(cari, mid +1, right);
            }
        }
        return -1;
    }
}
