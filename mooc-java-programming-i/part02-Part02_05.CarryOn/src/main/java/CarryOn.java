
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = "Yes";

        while (!input.equals("no")) {
            System.out.println("Shall we carry on?");
            input = scanner.nextLine();
        }
         
/*
        while (true) {

            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            if (input.equals("no")) {
                break;
            }

        }
*/
    }
}
