import java.util.Scanner;

public class CalculateLoan {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the annual interest rate, (eg: 7.25%) : ");
        double rate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        double monthlyInterestRate = (rate/100 * 12);

        double monthlyPayment = (loanAmount * monthlyInterestRate)/(
            1 - 1 / Math.pow((1 + monthlyInterestRate), years*12));

        double totalPayment = monthlyPayment * years * 12;

        System.out.println("The monthly payment is: $"
         + (int)  (monthlyPayment * 100) / 100.0);

        
        System.out.println("The total payment is: $"
         + (int)  (totalPayment * 100) / 100.0);

        input.close();
        
        
    }
}
