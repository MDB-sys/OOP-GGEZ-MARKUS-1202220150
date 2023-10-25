public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute

    private String name;
    private int phoneNumber;

    User(String name, int phoneNumber){
        setName(name);
        setPhoneNumber(phoneNumber);
    }
        
    
    public void setName(String name) {
        this.name = name;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void register(){
        System.out.println("selamat kamu berhasil login");
        System.out.println("nama kamu adalah "+ name);
        System.out.println("nomor telpon adalan "+ phoneNumber);

    }


    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message


}
