public class Cashier extends Bioskop {
    // TO DO : Create a method to print ticket
    Cashier(){
        super();

    }
    public void printTicket(User user) {
        for (int i = 0; i < super.seats.length; i++) {
            System.out.print('*');
        }
        System.out.println("Register berhasil");
        System.out.println("nama : " + user.getName());
        System.out.println("No.handphone : " + user.getnoHandPhone());
    }

    
}

