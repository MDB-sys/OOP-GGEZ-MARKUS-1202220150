
public class Kendaraan {
	protected String nomorIdentifikasi;
	protected double kecepatanMaksimum;
	protected int kapasitasPenumpang;
	
	public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang) {
		// TODO Auto-generated constructor stub
		 this.nomorIdentifikasi = nomorIdentifikasi;
         this.kecepatanMaksimum = kecepatanMaksimum;
         this.kapasitasPenumpang = kapasitasPenumpang; 
	}
	
	public String toString(){
        return "hello";
    }

    public double hitungWaktuTempuh(double jarak){
    	double result = 0;
    	
    	return result;
    }
}
