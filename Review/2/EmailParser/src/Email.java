import java.util.Scanner;

public class Email {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = input.nextLine();

        int index = email.indexOf("@");
        String username = email.substring(0, index);
        System.out.println("Username: "+ username);
 
        /*
                String text = "Hello";

        // Ensure the string is not empty to avoid StringIndexOutOfBoundsException
        if (text != null && !text.isEmpty()) {
            char lastChar = text.charAt(text.length() - 1);
            System.out.println("Last character: " + lastChar);
        } else {
            System.out.println("String is empty or null.");
        }
    }
 */
        int lastIndex = email.length();
        String domain = email.substring(index + 1, lastIndex);
        String str = String.format("Domain: %1$s", domain);
        System.out.println(str);


    input.close();

    }
}
