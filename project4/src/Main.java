import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you faculty?(y/n)");
        String input = scanner.nextLine();

        if (input.equals("y")) {
            System.out.println("Enter faculty access code: ");
            String code = scanner.nextLine();
            if (code.equals("1234")) {
                ExtendedMenu menu = new ExtendedMenu();
                menu.displayMenu();
            } else {
                System.out.println("Invalid input, shutting down system.");
            }

        } else if (input.equals("n")) {
            Menu menu = new Menu();
            menu.displayMenu();
        } else {
            System.out.println("Invalid input");
        }
    }
}
