import java.util.Date;
import java.util.Random;
 
public class BankAccount {

    int accountNumber;
    String ownerName;
    double balance;
    double interestRate;

    private Date dateCreated;
 
    public BankAccount(int accountNumber, String ownerName, double balance, double interestRate){

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public BankAccount(String ownerName, double startingBalance){
        
        this.ownerName = ownerName;

        //setting current date:
        this.dateCreated = new Date(); 

        //generating random num
        Random rand = new Random();
        this.accountNumber = rand.nextInt(); //js dont write any bound if you want any random 
        

        if(startingBalance < 0){
            startingBalance = 0;
        } else {
            this.balance = startingBalance; 
        }
    }
    
    

    public void transferTo(BankAccount acct, double amount){
        System.out.println("Withdrawing...."); 
        this.withdraw(amount);

        System.out.println("Depositing to acc2....");
        acct.deposit(amount);

    }

        public static void printSummary(BankAccount acct){

        System.out.println("Account Number: "+acct.accountNumber);
        System.out.println("Account owner: "+acct.ownerName);
        System.out.println("Balance: "+acct.balance);
     }



    public boolean deposit(double amount){  

        if(amount > 0){

            balance += amount;
            return true;
        } else{
            System.out.println("Invalid");
            return false;
        }    }

    public boolean withdraw(double amount){

        if((amount > 0 ) && (amount <= balance)){

            balance -= amount;
            return true;
        } else {
            System.out.println("Invalid");
            return false;
         }
    }

    public String toString(){
        return "Account: #"+ accountNumber +
                "| Owner: "+ ownerName +
                "| Balance: "+ balance;
    }

    
}









