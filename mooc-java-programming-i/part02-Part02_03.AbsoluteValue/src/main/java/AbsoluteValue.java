
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num < 0) {
            num = num * -1;
            System.out.println(num);
        } else {
            System.out.println(num);
        }
    }
}
