import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Email email;
    public static void main(String[] args) {
         email = new Email();
         changePassword();
         email.generateEmail();
         email.getInfo();

    }
    public static void changePassword() {
        System.out.println("would you like to change your password? [y/n]");
        String choice = input.next();
        if (choice.equals("y") || choice.equals("Y") || choice.equals("yes") || choice.equals("YES")) {
            boolean loop;
            do {
                System.out.println("Enter your password: ");
                String newPassword = input.next();
                email.setPassword(newPassword);
                System.out.println("Please confirm your password");
                String checkPassword = input.next();
                if (checkPassword.equals(newPassword)) {
                    System.out.println("Your password is " + email.getPassword() + "\n");
                    loop = true;
                }
                else {
                    System.out.println("Huh!... enter a matching password");
                    loop = false;
                }
            }
            while (!loop);
        }
        else if (choice.equals("n") || choice.equals("N") || choice.equals("no") || choice.equals("NO")) {
            System.out.println(" ");
        }

    }
}
