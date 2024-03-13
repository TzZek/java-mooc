
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int num = scanner.nextInt();
        System.out.print("Where from? ");
        int starting = scanner.nextInt();

        for (int i = starting; i <= num; i++) {
            System.out.println(i);
        }

    }
}
