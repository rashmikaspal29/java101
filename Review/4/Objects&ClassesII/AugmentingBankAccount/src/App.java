public class App {




        public static void main(String[] args) throws Exception {

            BankAccount[] accounts = new BankAccount[5];

            accounts[0] = new BankAccount(1001, "Shrijana Kaspal", 5000000.0, 4.8);
            accounts[1] = new BankAccount(1002, "John", 1000.0, 2.4);
            accounts[2] = new BankAccount(1003, "Sita", 1000.0, 5.5 );
            accounts[3] = new BankAccount(1004, "Viena", 20000.0, 3.9 );
            accounts[4] = new BankAccount(1005, "Rohit", 100000.0, 3.9 );


            double totalBalance = 0;
            for(BankAccount acc : accounts){
                                               //important!!! 
                totalBalance += acc.balance;   //since acc is an onject not an index we have to use . for accessing anything as per the array as we do acc : accounts, acc can access accounts[0].balance(bts)
            }
            System.out.println("The total Balance is: "+totalBalance);

            // System.out.println("After transferring from acc1 to acc2: ");

            // acc1.transferTo(acc2, 5000.0);

            // BankAccount.printSummary(acc1);
            // BankAccount.printSummary(acc2);

            // System.out.println("\nAfter Overriding: ");
            // System.out.println(acc1);

 
        // printSummary(acc1);
        
        // System.out.println("Depositing...");

        // acc1.deposit(2000.0);

        // printSummary(acc1);

    }
}
















