
public class AdvancedAstrology {

    public static void printStars(int number) {
        String stars = "";

        for (int i = 1; i <= number; i++) {
            stars += "*";
        }
        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        String spaces = "";
        for (int i = 1; i <= number; i++) {
            spaces += " ";
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        // Print the base of the tree
        for (int i = 0; i < 2; i++) {  // The base is two stars high
            printSpaces(height - 2);  // Adjusted for centering based on the tree width
            printStars(3);            // The base is three stars wide
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
