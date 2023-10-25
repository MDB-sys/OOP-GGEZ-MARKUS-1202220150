import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // TODO: Create Database Object

        Database database = new Database();
        // TODO: Create Konser Object and Set the Attributes

        Konser konser1 = new Konser("noah","15-11-2023","Sukabirus", 50000);

        Konser konser2 = new Konser("Sheila on 7", "15-11-2023", "Sukapura", 70000);

        User user1 = new User("Aldean_SI_46_03", 1202220150 );
        User user2 = new User("Markus Daniel Bryan_SI_46_03", 1202220150);

        database.addConser(konser1);
        database.addConser(konser2);


        // TODO: Insert Konser Object to Database


        // TODO: Display Greeting Message and Prompt User to Register


        // TODO: Create a User Object and Set the Attributes


        // TODO: Display Main Menu and Prompt User to Choose Menu
        
    }
}
