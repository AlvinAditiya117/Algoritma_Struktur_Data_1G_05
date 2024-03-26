public class DaftarMahasiswaBerprestasi05 {
    Mahasiswa05 listMhs[] = new Mahasiswa05[5];
    int idx;

    void tambah(Mahasiswa05 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh!!");
        }
    }

    void tampil() {
        for (Mahasiswa05 m : listMhs) {
            m.tampil();
            System.out.println("----------------------");
        }
    }

    void bubblesort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j <= listMhs.length - 1; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa05 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}