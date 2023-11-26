package Tugas;

public class Mobil extends Kendaraan {
	protected int jumlahPintu;
	public Mobil(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahPintu) {
		super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
		// TODO Auto-generated constructor stub
		this.jumlahPintu = jumlahPintu;
		this.kendaraan = "mobil";
	}

	public String toString(){
		return super.toString() + "\nJumlah pintu: " + this.jumlahPintu;
	}
	
}
