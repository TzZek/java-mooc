
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sum = 0;
        int counter = 0;

        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            
            sum += Integer.valueOf(parts[1]);
            counter++;
            
            if (longestName.length() < parts[0].length()){
                longestName = parts[0];
            }
            
        }
        
        double average = 1.0 * sum / counter;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
