import java.util.List;
import java.util.ArrayList;

public class Database {

    // TODO: Create List of Konser Object to Store Konser from Konser Class

    List<Konser> konsers = new ArrayList<>();
    

    // TODO: Create Method to insert Konser to Database

    protected void addConser(Konser konser){
        konsers.add(konser);
    }


    // TODO: Create Method to Show Konser from Database

    public void showConser(){
        int j = 1;
        for (Konser konser : konsers) {
            System.out.println(j + ". "+ konser.getBandName());
            System.out.println("Lokasi: " + konser.getLocation());
            System.out.println("tanggal: " + konser.getPlayDate());
            System.out.println("Harga Tiket: " + konser.getPriceTicket());

            j++;
        }
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price
    public void buyTicket(int konsers, int totalTicket){
        System.out.println("pilih nomor konser yang akan di beli: " + konsers );
        System.out.println("jumlah tiket yang di beli: "+ totalTicket);
    }

}
