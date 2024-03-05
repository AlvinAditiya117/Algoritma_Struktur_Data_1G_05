public class SegitigaMenu {
    public static void main(String[] args) {
    Segitiga[] SegiArray = new Segitiga[4];
    SegiArray[0] = new Segitiga(10,4);
    SegiArray[1] = new Segitiga(20,10);
    SegiArray[2] = new Segitiga(15,6);
    SegiArray[3] = new Segitiga(25,10);
    
    
    for (int i = 0; i < SegiArray.length;i++){
        System.out.println("Segitiga ke-"+i);
        System.out.println("Luas : "+SegiArray[i].HitungLuas());
        System.out.println("Keliling : "+SegiArray[i].HitungKeliling());
    }
  }
}
