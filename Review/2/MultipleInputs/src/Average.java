import java.util.Scanner;

public class Average {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();

        float total = num1 + num2 + num3;

        float average = total / 3;

        System.out.println("The average of three numbers is: "+ average);

    input.close();
    }
}
