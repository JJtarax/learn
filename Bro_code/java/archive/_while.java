import java.util.Scanner;

public class _while {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        // or
        /*
         * do {
         * System.out.print("Enter your name");
         * name = scanner.nextLine();
         * }while(name.isBlank());
         */

        System.out.println("Hello " + name);

        scanner.close();
    }
}
