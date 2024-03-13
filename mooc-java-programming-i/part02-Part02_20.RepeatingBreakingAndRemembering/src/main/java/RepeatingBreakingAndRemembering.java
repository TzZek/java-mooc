
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        int counter = 0;
        int countEven = 0;
        int countOdd = 0;

        while (true) {
            System.out.println("Give numbers:");

            num = scanner.nextInt();

            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (num != -1) {
                sum += num;
                counter++;
            }

            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

        }

        double average = 1.0 * sum / counter;

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even " + countEven);
        System.out.println("Odd " + countOdd);

    }
}
