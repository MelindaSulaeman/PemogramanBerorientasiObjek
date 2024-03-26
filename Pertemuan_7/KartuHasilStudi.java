package Pertemuan_7;

import java.util.List;
import java.util.ArrayList;


public class KartuHasilStudi
{
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMataKuliah;

    public KartuHasilStudi (String semester)
    {
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
    }
    
    public void addMataKuliah(MataKuliah MataKuliah){
        daftarMataKuliah.add(MataKuliah);
    }

    public String display()
    {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMataKuliah)
        {
        sb.append(mk.display());
        sb.append("\n");
        }
        return sb.toString();
    }

    public double getIps() {
        return ips;
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    public void setDaftarMataKuliah(List<MataKuliah> daftarMataKuliah) {
        this.daftarMataKuliah = daftarMataKuliah;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void hitungIPS() { //?? rumus hitungIPS
        double totalBobot = 0.0;
        int totalSKS = 0;

        for (MataKuliah mk : daftarMataKuliah) {
            totalBobot += mk.nilaiIndex() * mk.getSKS();
            totalSKS += mk.getSKS();
        }

        if (totalSKS > 0) {
            ips = totalBobot / totalSKS;
        } else {
            ips = 0; // jika totalSKS adalah 0, maka IPS dianggap 0
        }
    }

    //Setter dan Getter
    public int getTotalSKS(){
        int totalSKS = 0;
        for(MataKuliah mk : daftarMataKuliah){
            totalSKS += mk.getSKS();
        }
        return totalSKS;
    }

   
}