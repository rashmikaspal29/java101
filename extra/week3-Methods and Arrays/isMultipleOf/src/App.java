import java.util.Scanner;

public class App {

    
 

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter a divisor: ");
        int divisor = input.nextInt();

        if (isMultipleOf(number, divisor)){
            System.out.printf("%d is a multiple of %d.", number, divisor);
        } else{
            System.out.printf("%d is NOT a multiple of %d.", number, divisor);
        }

        App.isMultipleOf(15, 3);
    }

    public static boolean isMultipleOf(int number, int divisor){
        if (number % divisor == 0){
            return true;
        } else{  // always return every condition possible in non-void methods
            return false;
        }
    }
}
