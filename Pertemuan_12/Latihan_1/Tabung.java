package Pertemuan_12.Latihan_1;

public class Tabung extends Bentuk {
    private int tinggi;

    public Tabung(){
        super(0);
    }

    public Tabung(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

    /*
     * L: 2PHI . r (r+t)
     */

     @Override
     public double luas() {
        return 2*PHI*jari2*(jari2+tinggi);
     }

     // Setter & Getter

     public int getTinggi() {
        return tinggi;
     }

     public void setTinggo(int tinggi) {
        this.tinggi = tinggi;
     }
}
