import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Email email;

    public static void main(String[] args) {
        String choice;
        do {
           generateEmail();
           choice = prompt();
        }
        while (choice.equals("1"));
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
                    System.out.println("Huh!... Please enter a matching password");
                    loop = false;
                }
            }
            while (!loop);
        }
        else
            System.out.println(" ");
    }

    public static void generateEmail() {
        email = new Email();
        email.generateEmail();
        email.printPassword();
        changePassword();
        email.getInfo();
    }

    public static String prompt() {
        System.out.println("Would you like to create more mails");
        System.out.println("Enter");
        System.out.println("1 -to generate mail");
        System.out.println("2 -to exit");
        return input.next();
    }
}
