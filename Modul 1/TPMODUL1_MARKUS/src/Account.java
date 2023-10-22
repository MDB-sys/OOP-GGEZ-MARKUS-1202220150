public class Account {
    private String name;
    private int accountNumber;
    private int balance;

    Account (String name,int accountNumber,int balance){
        
    setName(name) ;
    setAccountNumber(accountNumber);;
    setBalance(balance);;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName (){
        return this.name;
    }

    public void setAccountNumber (int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber (){
        return this.accountNumber; 
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return this.balance;
    }

    public void deposit(int money){
        this.balance = this.balance + money;
        System.out.println("saldo akun " + getName() + " setelah menyetor:" + this.balance );
    }

    public boolean withdraw(int money){
        boolean result = false; 
        if(this.balance > money){
            this.balance = this.balance - money;
            result = true;
            System.out.println("Saldo akun "+ getName()+" setelah menarik uang: " + this.balance);
            return result;
        }
        else{
            System.out.println("maaf saldo anda tidak mencukup untuk melakukan penarikan");
            return result;
        }
        
    }
}
