public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private static final int rows = 5;
    
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private static final int colomn = 10;

    // TO DO: Create 2 dimensional array to store seat reservation status
    public int[][] seats = new int [rows][colomn];
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        seats[0][2] = 1;
        seats[1][5] = 1;
        seats[3][7] = 1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Selamat Datang di bioskop EAD");
        System.out.println("Booking Tiket Bioskop");
        // System.out.print(seats[0][2]);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colomn; j++) {

                System.out.print(seats[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }

    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {

            if(seats[row][seat] == 0){
                seats[row][seat] = 1;
                System.out.println("Bangku bisa di pesan");
                displaySeating();
            }else {
                System.out.println("maaf bangku sudah di pesan"); 
            }
            
    }
}