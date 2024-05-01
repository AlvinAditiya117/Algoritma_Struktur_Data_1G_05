public class BankAlvin05 {
    String norek;
    String nama;
    String nik;
    int umur;
    Double saldo;

    public BankAlvin05(String norek, String nama, String nik, int umur, Double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.saldo = saldo;
    }

    public void tampilDataBank() {
        System.out.println("======================================================");
        System.out.println("norek : " + norek);
        System.out.println("nama : " + nama);
        System.out.println("nik : " + nik);
        System.out.println("umur : " + umur);
        System.out.println("saldo : " + saldo);
    }
}