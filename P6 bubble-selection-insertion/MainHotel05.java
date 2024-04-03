import java.util.Scanner;

public class MainHotel05 {
    public static void main(String[] args) {
        HotelService05 list = new HotelService05();
        Hotel05 r1 = new Hotel05("Ijen Suites", "Malang", 5000000, (byte) 5);
        Hotel05 r2 = new Hotel05("RedDoorz", "Surabaya", 200000, (byte) 4);
        Hotel05 r3 = new Hotel05("Surya", "Madura", 3000000, (byte) 3);
        Hotel05 r4 = new Hotel05("Kencana", "Bengkulu", 6000000, (byte) 1);
        Hotel05 r5 = new Hotel05("Mewah", "Manado", 2500000, (byte) 2);

        list.tambah(r1);
        list.tambah(r2);
        list.tambah(r3);
        list.tambah(r4);
        list.tambah(r5);

        Scanner sc05 = new Scanner(System.in);

        System.out.println("Tampilkan Hotel berdasarkan : ");
        System.out.println("1. Harga dimulai dari harga termurah ke harga tertinggi.");
        System.out.println("2. Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1) ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("+==> : ");
        int pilihan = sc05.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Sorting Hotel berdasarkan Harga terendah");
                list.bubbleSort();
                list.tampilAll();
                break;
            case 2:
                System.out.println("Sorting Hotel berdasarkan Bintang tertinggi(5)");
                list.selectionSort();
                list.tampilAll();
                break;

            default:
                System.out.println("pilihan anda tidak ada");
                break;
        }
    }
}
