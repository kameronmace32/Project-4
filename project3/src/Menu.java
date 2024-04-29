import java.util.Scanner;
public class Menu {
    Scanner scanner = new Scanner(System.in);
    Bank bank = new Bank();


    public void displayMenu() {
        while (true) {
            System.out.printf("\n%sMenu%s\n", "**********", "**********");
            System.out.print("Please make a selection\n");
            System.out.print("1) Access existing account\n");
            System.out.print("2) Open new account\n");
            System.out.print("3) Close all accounts\n");
            System.out.print("4) Exit\n");
            System.out.print(">>");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1) {
                accessExistingAccount();
            } else if (input == 2) {
                openNewAccount();
            } else if (input == 3) {
                closeAllAccounts();
            } else if (input == 4) {
                break;
            } else {
                System.out.println("Invalid entry");
            }
        }
    }

    private void accessExistingAccount() {
        System.out.println("Input PIN: ");
        String pin = scanner.nextLine();

        Customer customer = bank.getCustomer(pin);
        if (customer == (null)) {
            System.out.println("PIN not valid");
            return;
        } else {
            System.out.println(customer);

            System.out.println(customer.getAllAccounts());

            System.out.println("Enter number of account to access: ");
            int accountToAccess = Integer.parseInt(scanner.nextLine());

            Account account = customer.getAccount(accountToAccess);
            if (account == (null)) {
                System.out.println("Account number invalid");
                return;
            } else {
                while (true) {
                    System.out.printf("\n%sAccount Menu%s\n", "*******", "*******");
                    System.out.print("Please make a selection:\n");
                    System.out.print("1) Make a deposit\n");
                    System.out.print("2) Make a withdrawal\n");
                    System.out.print("3) See account balance\n");
                    System.out.print("4) Close account\n");
                    System.out.print("5) Exit\n");
                    System.out.print(">>");
                    int input = Integer.parseInt(scanner.nextLine());

                    if (input == 1) {
                        System.out.println("Enter amount to deposit into account: " + accountToAccess);
                        double deposit = Double.parseDouble(scanner.nextLine());
                        account.deposit(deposit);
                    } else if (input == 2) {
                        System.out.println("Enter amount to withdrawal from account: " + accountToAccess);
                        double withdrawal = Double.parseDouble(scanner.nextLine());
                        account.withdrawal(withdrawal);
                    } else if (input == 3) {
                        System.out.printf("Account balance: $%.2f", account.getFunds());
                    } else if (input == 4) {
                        System.out.println("Close account: " + accountToAccess);
                        customer.closeAccount(accountToAccess);
                        return;
                    } else if (input == 5) {
                        return;
                    } else {
                        System.out.println("Invalid entry");
                    }
                }
            }
        }

    }

    private void openNewAccount() {
        double deposit;

        System.out.println("Are you a new customer?");
        System.out.println("1) Yes");
        System.out.println("2) No");

        int existingCustomer = Integer.parseInt(scanner.nextLine());

        if (existingCustomer == 2) {
            System.out.println("Enter PIN:");
            String pin = scanner.nextLine();
            Customer customer = bank.getCustomer(pin);
            if (customer == null) {
                System.out.println("Invalid PIN, customer does not exist.");
                return;
            } else {
                System.out.println("Enter deposit for new account: ");
                deposit = Double.parseDouble(scanner.nextLine());
                Account account = new Account(deposit);
                customer.addAccount(account.getAccountNum(), account);
                System.out.println("New account info: " + account);
            }

        } else if (existingCustomer == 1) {
            Customer newCustomer = createNewCustomer();
            System.out.println("Enter deposit amount for new account: ");
            deposit = Double.parseDouble(scanner.nextLine());
            Account account = new Account(deposit);
            newCustomer.addAccount(account.getAccountNum(),account);
            System.out.println("New account opened: \n" + account);
        }else{
            System.out.println("Invalid option. Select 1 or 2: ");
        }
    }

    private Customer createNewCustomer() {
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Please enter a 4 digit PIN: ");
        String pin = scanner.nextLine();

        Customer customer = new Customer(firstName, lastName, pin);

        bank.addCustomer(pin, customer);

        return customer;
    }

    private void closeAllAccounts(){
        System.out.println("Enter your PIN: ");
        String pin = scanner.nextLine();

        if (bank.getCustomer(pin) == null){
            return;
        } else {
            bank.removeCustomer(pin);
            System.out.println("Customer removed.");
        }
    }
}