import java.util.Scanner;

public class MainPanngkat05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        System.out.println("------------------");
        System.out.print("masukkan jumlah elemen yang dihitung : ");
        int elemen = sc05.nextInt();

        Pangkat05[] png = new Pangkat05[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat05();
            System.out.print("masukkan nilai yang hendak dipangkat : ");
            png[i].nilai = sc05.nextInt();
            System.out.print("masukkan nilai pemangkat : ");
            png[i].pangkat = sc05.nextInt();
        }
            System.out.println("HASIL PANGKAT - BRUTE FORCE");
            for (int i = 0; i < elemen; i++) {
                System.out.println("hasil dari"
                +png[i].nilai+" pangkat "
                +png[i].pangkat+" adalah "
                +png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
            System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
            for (int i = 0; i < elemen; i++) {
                System.out.println("hasil dari"
                +png[i].nilai+" pangkat "
                +png[i].pangkat+" adalah "
                +png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
        }
    }
