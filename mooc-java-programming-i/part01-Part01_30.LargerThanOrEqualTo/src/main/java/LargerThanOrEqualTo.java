
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = scan.nextInt();

        System.out.println("Give the second number:");
        int secondNum = scan.nextInt();

        if (firstNum > secondNum) {
            System.out.println("Greater number is: " + firstNum);
        } else if (secondNum > firstNum) {
            System.out.println("Greater number is: " + secondNum);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
