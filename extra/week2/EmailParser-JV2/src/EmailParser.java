import java.util.Scanner;

public class EmailParser {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = input.nextLine();

        int index = email.indexOf("@");
        
        String userName = email.substring(0, index);
        System.out.println("Username: "+userName); //where can we use the formatted string?
 
        String domain = email.substring(index +1); // (index + 1) = ([1:])
        System.out.print("Domain: "+domain);

    input.close();
    }
}

//String domain = email.substring(index +1);
        // System.out.print("Domain: "+domain);

        // why? 
        // String domain = email.substring(index +1);
        // this will give me everything after @, like[1:]