public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi unEkspedisi = new Ekspedisi(10, "Jakarta", 10000, "tidak diketahui");

        unEkspedisi.informasi();
        // TO DO: Create teluexpress Object from TelUExpress Class

        TelUExpress tel1 = new TelUExpress(100, "Bandung", 50000, true, "TelUxpress");
        tel1.informasi();
        // TO DO: Create friexpress Object from FRIExpress Class

        tel1.antar(1628389);

        tel1.antar(1922722, 7628262);

        FRIExpress fri1 = new FRIExpress(30, "Bojongsoang", 70000, "FRIExpress", false);

        fri1.informasi();

        fri1.terima(2000);

        fri1.kirim("Lembang");
        
        fri1.kirim("Braga" , "Rancaekek");
    }
}
