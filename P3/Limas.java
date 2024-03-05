public class Limas {
    public double PanjangSisiAlas;
    public double tinggi;    
public Limas (double PanjangSisiAlas, double tinggi) {
    this.PanjangSisiAlas = PanjangSisiAlas;
    this.tinggi = tinggi;
}
public double hitungLuasPermukaan() {
    return PanjangSisiAlas * PanjangSisiAlas + 4 * (0.5 * PanjangSisiAlas * Math.sqrt((tinggi * tinggi) + ((PanjangSisiAlas * PanjangSisiAlas) / 4)));
}
public double hitungVolume() {
    return (1.0/3.0) * PanjangSisiAlas * PanjangSisiAlas * tinggi;
    }
}
