public class Admin extends User {
    public Admin(String name, int Id) {
        super(name, Id);
    }

    public void manageSystem(String course) {
        System.out.println(this.name + " is managing " + course);
    }

    @Override
    public String getUserDetails() {
        return super.getUserDetails();
    }
}
