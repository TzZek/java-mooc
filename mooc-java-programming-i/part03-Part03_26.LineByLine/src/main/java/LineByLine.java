
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        String sentence = "";
        
        while (true) { 
            input = scanner.nextLine();
            
            if (input.trim().isEmpty()){
                String[] pieces = sentence.split(" ");
                
                for (int i = 0; i < pieces.length; i++){
                    System.out.println(pieces[i]);
                }
                
                break;
            } else {
                sentence += input + " ";
            }
    
        }
        

    }
}
