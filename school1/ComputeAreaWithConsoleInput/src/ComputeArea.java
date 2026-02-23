import java.util.Scanner;
public class ComputeArea {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = Math.pow(radius, 2) * Math.PI;
        System.out.print("The area for the circle of radius " +
            radius + " is " + area);

        input.close();
        
        
    }
     
}
