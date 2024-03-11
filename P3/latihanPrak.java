import java.util.Scanner;
public class latihanPrak {
    public static void main(String[]args){
        Scanner sc05 = new Scanner(System.in);
        Kerucut[] kerucutArray = new Kerucut[2];
        Limas[] LimasArray = new Limas[2];
        Bola[] BolaArray = new Bola[2];
        System.out.println("kerucut\n");
        for (int i = 0; i < kerucutArray.length; i++) {
            System.out.println("\nkerucut ke- "+ (i));
            System.out.println("masukkan jari-jari : ");
            double JariJariKerucut = sc05.nextDouble();
            System.out.println("masukkan sisi miring : ");
            double SisiMiringKerucut = sc05.nextDouble();
            kerucutArray[i] = new Kerucut(JariJariKerucut, SisiMiringKerucut);
        }
        System.out.println("\nimas segi empat sama sisi\n");
        for (int i = 0; i < LimasArray.length; i++) {
            System.out.println("\nLimas ke- "+i);
            System.out.println("masukkan panjang sisi alas : \n");
            double panjangSisiAlasLimas = sc05.nextDouble();
            System.out.println("masukkan tinggi limas : ");
            double tinggiLimas = sc05.nextDouble();
            LimasArray[i] = new Limas(panjangSisiAlasLimas, tinggiLimas);
        }
        System.out.println("\nBola");
        for (int i = 0; i < BolaArray.length; i++) {
            System.out.println("\nBola ke- "+i);
            System.out.println("masukkan jari jari bola : \n");
            double JariJariBola = sc05.nextDouble();
            BolaArray[i] = new Bola(JariJariBola);
        }
        for (int i = 0; i < kerucutArray.length; i++) {
            System.out.println("kerucut"+i+":");
            System.out.printf("luas permukaan  : %.2\n", kerucutArray[i].HitungLuasPermukaan());
            System.out.printf("volume :  %.2\n", kerucutArray[i].HitungVolume());
        }
        for (int i = 0; i < LimasArray.length; i++) {
            System.out.println("limas"+i+":");
            System.out.printf("luas permukaan  : %.2\n", LimasArray[i].hitungLuasPermukaan());
            System.out.printf("volume :  %.2\n", LimasArray[i].hitungVolume());
        }
        for (int i = 0; i < BolaArray.length; i++) {
            System.out.println("Bola"+i+":");
            System.out.printf("luas permukaan  : %.2\n", BolaArray[i].HItungPermukaan());
            System.out.printf("volume :  %.2\n", BolaArray[i].HitungVolume()); 
        }
    }
    
}
