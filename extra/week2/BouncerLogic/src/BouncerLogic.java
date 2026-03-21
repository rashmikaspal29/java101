import java.util.Scanner;

public class BouncerLogic {
 
    public static void main(String[] args) throws Exception {
        
        // int age;
        // boolean hasID;
        // boolean isWithParent;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Do you have ID?(y/n) ");
        String hasIDInput = input.next();
        boolean hasID = hasIDInput.equalsIgnoreCase("y");

        System.out.print("Are you with parent?(y/n) ");
        String parents = input.next();
        boolean isWithParent = parents.equalsIgnoreCase("y");

        if (age >= 18 && hasID || age >= 16 && isWithParent && hasID){
            System.out.println("ALLOWED");
        } else{
            System.out.println("DENIED");

            if (age <= 16 && (!isWithParent)){
                System.out.print("Too young!");
            } else if (age >= 18 && (!hasID)){
                System.out.print("Missing ID");
            }
        }


    input.close();
    }
}

// The error means the program called scanner.nextBoolean() 
// at line 17, but the input provided wasn't a valid boolean value.

// nextBoolean() only accepts exactly true or
//  false (case-insensitive). If you typed
//  anything else — like yes, 1, y, or even an
//  extra space — it throws InputMismatchException.

// Let me look at the code to give more specific context.

// Read e:\BHCC\personalPractice\Java\java101\extra\week2\BouncerLogic\src\BouncerLogic.java
// There's the problem. Your prompt says (y/n) but nextBoolean() only understands true or false.
// When you type y or n, it crashes.

// You have two options:

// Option 1 — Change the prompt to match what nextBoolean() expects:


// "Do you have ID? (true/false): "
// Then users must type true or false.


//NOTE: imp:
// Option 2 — Read input as a String and check for "y":

// String hasIDInput = input.next();
// boolean hasID = hasIDInput.equalsIgnoreCase("y");
// This lets users type y or n as your prompt suggests.

// you don't need to explicitly check for "n" — anything that
// isn't "y" automatically becomes false. 
// The "n" case is handled implicitly