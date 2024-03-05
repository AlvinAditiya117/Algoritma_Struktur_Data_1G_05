public class Bola {
    public double JariJari;
    public Bola(double JariJari){
        this.JariJari = JariJari;
    }
    public double HItungPermukaan(){
        return 4 *  Math.PI * JariJari + JariJari;
    }
    public double HitungVolume(){
        return (4.0/3.0) * Math.PI * JariJari * JariJari * JariJari;
    }
}
