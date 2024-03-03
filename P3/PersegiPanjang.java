import java.util.Scanner;

public class PersegiPanjang {
    public int panjang;
    public int lebar;
public static void main(String[]args) {
    PersegiPanjang[] ppArray = new PersegiPanjang[3];

    Scanner sc05 = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
        
ppArray[i] = new PersegiPanjang();
System.out.println("persegi panjang ke-"+i);
System.out.print("masukkan panjang : ");
ppArray[i].panjang = sc05.nextInt();
System.out.print("masukkan lebar : ");
ppArray[i].lebar = sc05.nextInt();

 }

 for (int i = 0; i < 3; i++) {
    System.out.println(" persegi panjang ke-"+i);
    System.out.print("panjang : "+ppArray[i].panjang+", lebar : "+ppArray[i].lebar);
    }
  }
}