package Pertemuan_12.Tugas;

public class SistemOtentikasi implements Otentikasi {
    private String sidikJari;

    public SistemOtentikasi(String sidikJari) {
        this.sidikJari = sidikJari;
    }

    @Override
    public boolean verifikasiSidikJari(String sidikJariInput) {
        return sidikJari.equals(sidikJariInput);
    }
}
