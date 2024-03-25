import java.util.Scanner;

public class MainFaktotial05 {
    public static void main(String[] args) {
    Scanner sc05 = new Scanner(System.in);
    System.out.println("-----------------------");
    System.out.print("masukkan jumlah elemen : ");
    int iJml = sc05.nextInt();
    

    Faktorial05[] fk = new Faktorial05[iJml];
    for (int i = 0; i < iJml; i++) {
        fk[i] = new Faktorial05();
        System.out.print("masukkan nilai data ke-"+(i+1)+(" : "));
        fk[i].nilai = sc05.nextInt();
    }
    System.out.println("HASIL - BRUTE FORCE");
    for (int i = 0; i < iJml; i++) {
        System.out.println("HASIL PERHITUNGAN MENGGUNAKAN BRUTE FORCE ADALAH "+fk[i].faktorialBF(fk[i].nilai));
    }
    System.out.println("HASIL - DEVINE AND CONQUER");
    for (int i = 0; i < iJml; i++) {
    System.out.println("HASIL PERHITUNGAN FAKTORIAL MENGGUNAKAN DIVINE AND COQUER ADALAH "+fk[i].faktorialDC(fk[i].nilai));
    }
  }   
}
