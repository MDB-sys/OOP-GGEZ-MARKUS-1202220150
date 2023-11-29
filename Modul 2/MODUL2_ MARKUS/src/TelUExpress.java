public class TelUExpress extends Ekspedisi //...
{      
    protected boolean antarInter;
    protected String expedisi; 
    public TelUExpress(int jumlahCabang, String pusat, float tarif,boolean antarInter, String ekspedisi){
        super(jumlahCabang, pusat, tarif, ekspedisi);
        this.antarInter = antarInter;
    }

    public void informasi(){
        super.informasi();
        if(antarInter == true){
            System.out.println("Selain itu, ekspedisi ini melayani pengantaran Internasional");
        }else {
            System.out.println("Selain itu, ekspedisi ini tidak melayani pengantaran Internasional");
        }
    }

    public void ambil(String tempat){
        System.out.println(this.ekspedisi + " berhasil mengambil paket ke " + tempat);    
    }

    public void antar(int resi){
        System.out.println(this.ekspedisi + " berhasil mengantar paket dengan nomor resi " + resi);
    }

    
    public void antar(int resi_1, int resi_2){
        System.out.println(this.ekspedisi + " berhasil mengantar paket dengan nomor resi " + resi_1);
    }
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)

    // TO DO: Create Constructor of TelUExpress

    // TO DO: Create 'informasi' Method to show Information

    // TO DO: Create 'ambil' Method to pick up a package

    // TO DO: Create 'antar' Method to send a package

    // TO DO: Create 'antar' Method to send two packages
}
