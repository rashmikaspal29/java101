import java.util.Scanner;

public class EnterSystem {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Has ID? ");
        boolean id = input.nextBoolean();

        System.out.print("With Parents? ");
        boolean parents = input.nextBoolean();

        if((age >= 18 && id) || (age >= 16 && parents && id)){
            System.out.println("ALLOWED");
        }else{
            System.out.println("DENIED");
            if(age >= 18 && id == false){
                System.out.println("Missing IDs.");
            } else if(age >= 16 && parents == false && id){
                System.out.println("Can't allow without parents.");
            } else if(age < 16){
                System.out.println("Too young");
            }
        }

        input.close();
        
    }
}
