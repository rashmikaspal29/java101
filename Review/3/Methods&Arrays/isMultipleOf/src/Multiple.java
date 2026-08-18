import java.util.Scanner;

public class Multiple {

    public static boolean isMultipleOf(int number, int divisor){
        if(number % divisor != 0){
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter a divisor: ");
        int divisor = input.nextInt();

        if(isMultipleOf(number, divisor)){
            String str = String.format("%1$s is a multiple of %2$s", number, divisor);
            System.out.println(str);
        } else {
            String notStr = "%1$s is NOT a multiple of %2$s" .formatted(number, divisor);
            System.out.println(notStr);
        }

        input.close();
    }
}
