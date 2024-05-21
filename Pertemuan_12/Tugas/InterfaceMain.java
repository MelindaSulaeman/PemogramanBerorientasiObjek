package Pertemuan_12.Tugas;

public class InterfaceMain {
    public static void main(String[] args)  {
        SistemOtentikasi sistemOtentikasi = new SistemOtentikasi("hgij5684");

        // Contoh penggunaan otentikasi
        System.out.println("Verifikasi Sidik Jari: " + sistemOtentikasi.verifikasiSidikJari("hgij5684")); // Output: true
        System.out.println("Verifikasi Sidik Jari: " + sistemOtentikasi.verifikasiSidikJari("klhy4587")); // Output: false
    }
}
