public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute

    private String name;
    private int phoneNumber;
    private String password;

    User(String name, int phoneNumber, String password){
        setName(name);
        setPhoneNumber(phoneNumber);
        setPassword(password);
    }
        
    
    public void setName(String name) {
        this.name = name;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password){
        this.password = password;    
    }


    public void display(){
        System.out.println("selamat kamu berhasil login");
        System.out.println("nama kamu adalah "+ name);
        System.out.println("nomor telpon adalan "+ phoneNumber);

    }

    // TODO: Create Method to display User and Display User's Name and Phone Number and success message


}
