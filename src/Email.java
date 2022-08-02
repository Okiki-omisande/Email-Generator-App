import java.util.Scanner;
import java.security.SecureRandom;

public class Email {
    private  String firstname;
    private  String lastname;
    private  String department;
    private  String password;

    Scanner in = new Scanner(System.in);

    public Email() {
        this.firstname = firstname();
        this.lastname = lastname();
        this.department = setDepartment();
        this.password = setPassword(10);
    }

    public String firstname() {
        System.out.print("Enter firstname: ");
        return setFirstname(in.next());
    }

    public String lastname() {
        System.out.print("Enter lastname: ");
         return setLastname(in.next());
    }

    public String setDepartment() {
       String dept = "";
        System.out.println("Department:");
        System.out.println("Enter \n1- sales \n2- development \n3- account \n4- none");
        switch (in.nextInt()) {
            case 1:
                dept = "sales";
                break;

            case 2:
                dept = "development";
                break;

            case 3:
                dept = "account";
                break;

            case 4:
                 dept = "";
                break;

            default:
                System.out.println("please enter a valid value");
                in.nextInt();
        }
        return setDepartment(dept);
    }

    public String setPassword(int passwordLength) {
        SecureRandom randomNo = new SecureRandom();
        String password = "AB#@_CDEF234GHI89*7JKZ156&";
        char[] pw = new char[passwordLength];
        for (int i = 0; i < pw.length; ++i) {
            int random = randomNo.nextInt(passwordLength); 
            pw[i] = password.charAt(random);
        }

        return setPassword(new String(pw));
    }

   public String setFirstname(String firstname) {
        return this.firstname = firstname;
   }
    public String getFirstname() {
        return firstname;
    }

    public String setLastname(String lastname) {
        return this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public String setDepartment(String department) {
        return this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    public String setPassword(String password) {
       return this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getMailCapacity() {
        return 500;
    }

    public void generateEmail() {
        String companyName = "hyundai.com";
        System.out.println("Email: "+getFirstname() + "." +getLastname() + "@" +getDepartment()
        + "." + companyName +"\n");
    }

    public void printPassword() {
        System.out.println("your password is: " +getPassword());
    }

    public void getInfo() {
        System.out.println("New Worker Details");
        System.out.println("first name: " +getFirstname());
        System.out.println("last name: " +getLastname());
        System.out.println("department: " +getDepartment());
        System.out.println("password: " +getPassword());
        System.out.println("mail capacity: " +getMailCapacity() + "\n");
    }
}
