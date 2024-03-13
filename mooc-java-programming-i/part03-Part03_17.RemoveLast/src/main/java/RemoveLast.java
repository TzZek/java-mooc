
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);

        System.out.println("1st last removed: " + strings);

        removeLast(strings);

        System.out.println("2nd last removed: " + strings);
        
        removeLast(strings);
                
        System.out.println("3rd last removed: " + strings);
        
       removeLast(strings);
    }

    public static void removeLast(ArrayList<String> strings) {

        if (strings.size() > 0) {
            int last = strings.size() - 1;
            strings.remove(last);
        } else {
            System.out.println("Empty List");
        }

    }

}
