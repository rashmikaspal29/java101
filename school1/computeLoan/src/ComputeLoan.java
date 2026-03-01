import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // yearly interest rate:
        System.out.print("Enter yearly interest rate, for eg: 8.25: ");
        double annualRate = input.nextDouble();

        // monthly interest rate:
        double monthlyRate = annualRate / 1200;

        // number of years:
        System.out.print("Enter number of years as an integer, for eg, 5: ");
        int numOfYears = input.nextInt();

        // loan amount:
        System.out.print("Enter loan amount, for.eg: 120000.95: ");
        double loanAmount = input.nextDouble();

        // calculate payments
        double monthlyPayment = loanAmount * monthlyRate / (1
                - 1 / Math.pow(1 + monthlyRate, numOfYears * 12));

        double totalPayment = monthlyPayment * numOfYears * 12;

        System.out.println("The monthly payment is " +
                (int) (monthlyPayment * 100) / 100.0);

        System.out.println("The total payment is " +
                (int) (totalPayment * 100) / 100.0);

    }
}
