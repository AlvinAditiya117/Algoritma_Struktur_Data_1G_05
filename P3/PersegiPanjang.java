import java.util.Scanner;

public class PersegiPanjang {
    public int panjang;
    public int lebar;
public static void main(String[]args) {

    System.out.println("masukkan jumlah persegi panjang : ");

    Scanner sc05 = new Scanner(System.in);

    PersegiPanjang[] ppArray = new PersegiPanjang[9];

    for (int i = 0; i < ppArray.length; i++) {
        
ppArray[i] = new PersegiPanjang();
System.out.println("persegi panjang ke-"+i);
System.out.print("masukkan panjang : ");
ppArray[i].panjang = sc05.nextInt();
System.out.print("masukkan lebar : ");
ppArray[i].lebar = sc05.nextInt();

 }

 for (int i = 0; i < ppArray.length; i++) {
    System.out.println(" persegi panjang ke-"+i);
    System.out.print("panjang : "+ppArray[i].panjang+", lebar : "+ppArray[i].lebar);
    }
  }
}