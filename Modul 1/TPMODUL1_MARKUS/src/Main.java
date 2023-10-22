public class Main {
    public static void main(String[]args) throws Exception {
        Bank mandiri = new Bank();

        mandiri.createAccount("Aldean", 1202200777, 100000);
        mandiri.createAccount("Markus_SI4603", 1202220150, 200000);
        mandiri.createAccount("Gemilang", 1202200999, 300000);

        
        System.out.println("--------------");

        mandiri.depositAccount("Aldean", 50000);
        mandiri.withdrawAccount("Markus_SI4603", 20000);

        System.out.println("--------------");
        
        mandiri.removeAccount("Gemilang");
        System.out.println("------------");

        mandiri.getAllAccount();

        // System.out.println();
    }
}
