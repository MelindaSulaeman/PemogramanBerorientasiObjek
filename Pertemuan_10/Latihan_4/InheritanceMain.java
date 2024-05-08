package Pertemuan_10.Latihan_4;

public class InheritanceMain {
    public static void main(String[] args)
    {
        Mahasiswa mhs = new Mahasiswa("223040091", "Melinda Sulaeman", "Bandung");
        System.out.println(mhs.getNrp()+ 
                        "-"+ mhs.getNama()+
                        "-"+ mhs.getAlamat());
    }   
}
