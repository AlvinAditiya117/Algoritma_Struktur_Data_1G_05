import java.util.Scanner;

public class mahhasiswaa {
    public static void main(String[]args){
        Scanner sc05 = new Scanner(System.in);
        Mhasiswa[] mhs = new Mhasiswa[](3);
        for (int i = 0; i < 3; i++) {
            System.out.println("masukkan data mahasiswa ke- "+ (i+1));
            System.out.println("masukkan nama : ");
            String nama = sc05.nextLine();
            System.out.println("masukka nim : ");
            String nim = sc05.nextLine();
            System.out.println("masukkan jenis kelamin ( L/p ) : )");
            char JenisKlm = sc05.nextLine().charAt(0);
            System.out.println("masukkan IPK : ");
            double ipk = sc05.nextDouble();
            sc05.nextLine();
            mhs[i] = new mahasiswaMenu(nama,nim,JenisKlm,ipk);
        }
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("\ndata mahasiswa ke- "+(i+1));
            System.out.println("nama : "+mhs[i].getNama());
            System.out.println("nim : "+mhs[i].getNim());
            System.out.println("jenis kelamin : "+mhs[i].getJenisKlm());
            System.out.println("ipk : "+mhs[i].getIpk());
        }
    }
}
