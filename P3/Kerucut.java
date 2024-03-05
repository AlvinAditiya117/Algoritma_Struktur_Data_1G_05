public class Kerucut {
    public double JariJari;
    public double SisiMiring;
public Kerucut(double JariJari,double SisiMiring){
    this.JariJari = JariJari;
    this.SisiMiring = SisiMiring;
}
public double HitungLuasPermukaan(){
    return  Math.PI * JariJari * (JariJari + JariJari);
}
public double HitungVolume(){
    return (1.0/3.0) * Math.PI * JariJari * JariJari * SisiMiring;
}
}
