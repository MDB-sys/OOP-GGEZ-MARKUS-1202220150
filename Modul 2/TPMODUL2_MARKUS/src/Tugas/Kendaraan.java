package Tugas;

public class Kendaraan {
	protected String nomorIdentifikasi;
	protected double kecepatanMaksimum;
	protected int kapasitasPenumpang;
	protected String kendaraan;
	
	public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang) {
		// TODO Auto-generated constructor stub
		 this.nomorIdentifikasi = nomorIdentifikasi;
         this.kecepatanMaksimum = kecepatanMaksimum;
         this.kapasitasPenumpang = kapasitasPenumpang; 
        //  this.kendaraan = "Kendaraan";
	}
	

	
	// public String toString(){
    //     String  result= "informasi " + this.kendaraan + ":\n" + "nomor Identifikasi: " + this.nomorIdentifikasi + "\nkecepatan maksimum: " + this.kecepatanMaksimum + " KM/jam" + "\nkapasitas penumpang: " + this.kapasitasPenumpang + " orang"	 ;
        
    //     return result;
    // }

    // @Override
	// public String toString() {
	// 	return "Kendaraan [nomorIdentifikasi=" + nomorIdentifikasi + ", kecepatanMaksimum=" + kecepatanMaksimum
	// 			+ ", kapasitasPenumpang=" + kapasitasPenumpang + ", kendaraan=" + kendaraan + "]";
	// }



	// public String hitungWaktuTempuh(double jarak){
    // 	double result = jarak/this.kecepatanMaksimum;
    // 	return "Waktu tempuh dengan " + this.kendaraan + ": " + result + " jam" ;
    	
    // }
}
