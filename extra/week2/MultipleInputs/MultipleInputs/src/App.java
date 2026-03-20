import java.util.Scanner;

public class App {
    
    int num1, num2, num3;
     
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        
         //System.out.printf("Enter 3 numbers: %d, %d, %d", num1, num2, num3);
         //No need of formatting since user is going to enter num1,2,3. 

        System.out.print("Enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int average = ((num1 + num2 + num3) / 3);

        System.out.print("The average of the 3 numbers is "+average);

    input.close();
         
    }
     
}

//NOTE:

//static context can't access instance variables

// num1, num2, num3 are instance variables (declared on the class). But main is a static method. 
// Static methods don't belong to any instance — they have no this — so they cannot access 
// instance variables directly.
// Fix: Declare them inside main as local variables:

 
