
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {

            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            nums.add(input);

        }
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }

        double average = 1.0 * sum / nums.size();
        System.out.println("Average: " + average);

    }
}
