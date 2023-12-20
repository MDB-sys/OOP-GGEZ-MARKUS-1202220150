public class User {
   // TO DO: Create Private Attributes of User (nama, noHandphone)
   
   // TO DO: Create Constructor of User
   private String name;
   private String noHandPhone;
   
   public void setName(String nama) {
            this.name = nama;
      }

   public void setNoHandPhone(String phoneNumber) {
      this.noHandPhone = phoneNumber;
      }
   // TO DO: Create register Method to show information about name and phone number
   public void register(String nama, String phoneNumber){
      System.out.println("====Silahkan Register====");
        setName(name);
        setNoHandPhone(phoneNumber);
    }
   // TO DO: Create method to return name and phone number
   
   public String getName() {
     return this.name;
  }

   public String getnoHandPhone() {
     return this.noHandPhone;
  }
}






  