class mahasiswaMenu {
    String nama;
    String nim;
    char JenisKlm;
    double ipk;
public mahasiswaMenu(String nama, String nim,char JenisKlm,double ipk){
    this.nama = nama;
    this.nim = nim;
    this.JenisKlm = JenisKlm;
    this.ipk = ipk;
}
public String getName(){
    return nama;
}
public String getNim(){
    return nim;
}
public char getJenisKlm(){
    return JenisKlm;
}
public double getIpk(){
    return ipk;
}
}