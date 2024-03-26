package Tugas2;

import java.util.Scanner;

public class PersegiPanjang {
	double panjang;
	double lebar;
	
	PersegiPanjang(double panjang, double lebar){
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	double hitungLuas() {
		return panjang * lebar;
	}
	
	double hitungKeliling() {
		return 2 * (panjang + lebar);
	}
	
	void tampil() {
		double luas = hitungLuas();
		double keliling = hitungKeliling();

		System.out.println("Panjang : " + panjang);
		System.out.println("Lebar : " + lebar);
		System.out.println("Luas : " + luas);
		System.out.println("Keliling : " + keliling);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Panjang : ");
		double panjang = input.nextDouble();
		
		System.out.print("Lebar : ");
		double lebar = input.nextDouble();
		
		PersegiPanjang persegi = new PersegiPanjang(panjang, lebar);
		persegi.tampil();
		
		input.close();
	}
}
