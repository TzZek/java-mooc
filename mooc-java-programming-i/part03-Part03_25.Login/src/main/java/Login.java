
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String pass = scanner.nextLine();

        if (username.equals("alex") && pass.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (username.equals("emma") && pass.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
