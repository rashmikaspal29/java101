public class App {




        public static void main(String[] args) throws Exception {
        BankAccount acc1 = new BankAccount(1001, "Shrijana Kaspal", 5000000.0, 2.8);
        BankAccount acc2 = new BankAccount(1002, "John", 1000.0, 2.4);

        System.out.println("After transferring from acc1 to acc2: ");

        acc1.transferTo(acc2, 5000.0);

        BankAccount.printSummary(acc1);
        BankAccount.printSummary(acc2);

 
        // printSummary(acc1);
        
        // System.out.println("Depositing...");

        // acc1.deposit(2000.0);

        // printSummary(acc1);

    }
}
















/*
NOTE: OLD CODE:

public class App {

    public static void printSummary(BankAccount acct){

        System.out.println("Account Number: "+acct.accountNumber);
        System.out.println("Account owner: "+acct.ownerName);
        System.out.println("Balance: "+acct.balance);
        //better if you format
    }


        public static void main(String[] args) throws Exception {
        BankAccount acc1 = new BankAccount();

        acc1.accountNumber = 1001;
        acc1.ownerName = "Shrijana Kaspal";
        acc1.balance = 5000000.0;

        printSummary(acc1);
        
        System.out.println("Depositing...");

        acc1.deposit(2000.0);

        printSummary(acc1);

    }
}*/
