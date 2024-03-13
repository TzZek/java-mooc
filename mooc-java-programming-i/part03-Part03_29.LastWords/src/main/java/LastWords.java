
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userInput = scanner.nextLine();

            String[] splitStringArray = userInput.split(" ");

            int lastIndex = splitStringArray.length - 1;
            
            System.out.println(splitStringArray[lastIndex]);

            if (userInput.equals("")) {
                break;
            }
        }

    }
}
