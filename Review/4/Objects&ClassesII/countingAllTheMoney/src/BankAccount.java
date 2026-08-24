public class BankAccount {

    int accountNumber;
    String ownerName;
    double balance;
    double interestRate;

    public BankAccount(int accountNumber, String ownerName, double balance, double interestRate){

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void transferTo(BankAccount acct, double amount){
        System.out.println("Withdrawing...."); //no need to write
        this.withdraw(amount);

        System.out.println("Depositing to acc2....");
        acct.deposit(amount);

    }

        public static void printSummary(BankAccount acct){

        System.out.println("Account Number: "+acct.accountNumber);
        System.out.println("Account owner: "+acct.ownerName);
        System.out.println("Balance: "+acct.balance);
        //better if you format
    }



    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public String toString(){
        return "Account: #"+ accountNumber +
                "| Owner: "+ ownerName +
                "| Balance: "+ balance;
    }

    
}









