
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int factorial = 1;
        
        System.out.print("Give a number: ");
        int num = scanner.nextInt();
        
        for (int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        
        System.out.println("Factorial: " + factorial);

    }
}
