public class Ekspedisi { 
    protected int jumlahCabang;
    protected String pusat;
    protected float tarif;
    protected String ekspedisi;
    
    public Ekspedisi(int jumlahCabang, String pusat, float tarif, String ekspedisi){
        this.jumlahCabang = jumlahCabang;
        this.pusat = pusat;
        this.tarif = tarif;
        this.ekspedisi = ekspedisi; 
    }

    public void informasi(){
        System.out.println("Ekspedisi " + this.ekspedisi +  " dengan jumlah cabang " + this.jumlahCabang + " dan berpusat di " + this.pusat + " mempunyai tarif sebesar " + this.tarif + " perkilogram");
    }
    // TO DO: Create Protected Attributes of Ekspedisi (jumlahCabang, pusat, tarif)

    // TO DO: Create Constructor of Ekspedisi

    // TO DO: Create 'informasi' Method to show Information
}
