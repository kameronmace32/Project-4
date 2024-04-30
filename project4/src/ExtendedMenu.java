public class ExtendedMenu extends Menu {

    @Override
    public void displayMenu() {

        super.displayMenu();
        while (true) {
            System.out.printf("%sMenu%s\n", "*********", "*********");
            System.out.print("Please make a selection\n");

            System.out.println("1) View pay information");
            System.out.println("2) Exit");
            System.out.println(">>");

            int input = Integer.parseInt(scnr.nextLine());
            if (input == 1) {
                payInformation();
            } else if (input == 2) {
                break;
            } else {
                System.out.println("Invalid Input");
            }

        }

    }

    private void payInformation(){
        System.out.println("You will be paid a gazillion dollars in two Fridays.");
    }
}