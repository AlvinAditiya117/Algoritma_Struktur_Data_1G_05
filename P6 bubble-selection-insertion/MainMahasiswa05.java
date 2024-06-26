public class MainMahasiswa05 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi05 list = new DaftarMahasiswaBerprestasi05();
        Mahasiswa05 m1 = new Mahasiswa05("Nusa", 2017, 25, 3);
        Mahasiswa05 m2 = new Mahasiswa05("Rara", 2012, 19, 4);
        Mahasiswa05 m3 = new Mahasiswa05("Fompu", 2018, 19, 3.5);
        Mahasiswa05 m4 = new Mahasiswa05("Abdul", 2017, 23, 2);
        Mahasiswa05 m5 = new Mahasiswa05("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubblesort();
        list.tampil();

        System.out.println("data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}

