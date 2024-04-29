public class Account {
    static int numOfAccounts = 1000;
    private int accountNum;
    private double balance;

    public Account(double initialDeposit){
        this.balance += initialDeposit;
        numOfAccounts = numOfAccounts + 1;
        this.accountNum = numOfAccounts;

    }

    public void deposit(double depositAmount){
        balance += depositAmount;
        System.out.printf("Amount deposited: $%.2f\nUpdated Balance: $%.2f\n", depositAmount, balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (withdrawalAmount > balance){
            System.out.printf("Insufficient funds, your balance is $%.2f\n", balance);
        }else {
            System.out.printf("Withdrawal amount: $%.2f\n", withdrawalAmount);
            balance -= withdrawalAmount;
            System.out.printf("New balance is $%.2f\n", balance);
        }
    }

    public int getAccountNum() {
        return accountNum;
    }

    public double getFunds() {
        return balance;
    }

    public String toString(){
        return String.format("Account number: %s\nAccount balance: $%.2f\n", accountNum,  balance);
    }
}
