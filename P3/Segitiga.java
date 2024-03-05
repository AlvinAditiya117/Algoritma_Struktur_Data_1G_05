public class Segitiga {
        public int alas;
        public int tinggi;
    public Segitiga(int  a,int t) {
        alas = a;
        tinggi = t;
    }
    public double HitungLuas(){
        return 0.5*alas*tinggi;
    }
    public double HitungKeliling(){
        double SisiMiring = Math.sqrt(alas*alas+tinggi);
        return(int)alas + (int) tinggi + (int)SisiMiring;
    }
}


    
    
