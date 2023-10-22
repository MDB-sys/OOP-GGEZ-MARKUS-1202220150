import java.util.ArrayList;

public class Bank {
    private ArrayList<Account>  accounts;

    Bank(){
        this.accounts = new ArrayList<>();
    }

    public void createAccount(String name, int accountNumber, int balance) {
        this.accounts.add(new Account(name, accountNumber, balance));
        System.out.println("Saldo akun " + name +": " + balance );
    }

    public void removeAccount(String name){
        int isFind = getAccount(name);
        System.out.println("Akun " + this.accounts.get(isFind).getName() + " Berhasil di hapus.");
        accounts.remove(isFind);
        
    }

    public void withdrawAccount(String name, int money){
        int isFind = getAccount(name);
        this.accounts.get(isFind).withdraw(money);
    }

    public void depositAccount(String name,int money){
        int isFind = getAccount(name);
        this.accounts.get(isFind).deposit(money);

    }

    public int getAccount(String name){
        int result = 0;
        int j = 0;
        
        for(Account i : accounts){
            if(i.getName() == name ){
                result = j;
                break;
            }
            j += 1;
        }
        return result;
    }

    public void getAllAccount(){
        System.out.println("Daftar semua akun Bank:");
        for (Account i : this.accounts) {

            System.out.print("Nama : " + i.getName()+',' + " ");
            System.out.print("Nomor Akun : " + i.getAccountNumber()+',' + " ");
            System.out.print("Saldo : " + i.getBalance());
            System.out.println();

        }
    }
}
