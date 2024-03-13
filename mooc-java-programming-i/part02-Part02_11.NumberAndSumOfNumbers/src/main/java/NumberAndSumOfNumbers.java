
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) {

            System.out.println("Give a number:");
            int num = scanner.nextInt();

            if (num != 0) {
                sum += num;
                counter++;
                continue;
            }

            if (num == 0) {
                break;
            }

        }
        
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + sum);
        

    }
}