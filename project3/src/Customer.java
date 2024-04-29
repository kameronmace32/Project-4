import java.util.HashMap;

public class Customer {
    //pokemon
    private String firstName;
    private String lastName;
    private String pin;

    private HashMap<Integer, Account> accountHashMap = new HashMap<>();

    //constructors

    @Override
    public String toString(){
        return String.format("Name: %s %s\nPin: %s",firstName,lastName,pin);
    }
    public Customer(String firstName, String lastName, String pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public void addAccount(int accountNum, Account account){
        accountHashMap.put(accountNum, account);
    }
    public void closeAccount(int accountNum){
        accountHashMap.remove(accountNum);
    }
    public Account getAccount(int accountNum){
        Account foundAccount;
        if(accountHashMap.containsKey(accountNum)){
            foundAccount = accountHashMap.get(accountNum);
        } else{
            foundAccount = null;
        }
        return foundAccount;
    }


    public StringBuilder getAllAccounts(){
        StringBuilder accountStringBuilder = new StringBuilder();
        accountHashMap.forEach((accountNum, account) -> {
            accountStringBuilder.append(account.toString());
        });
        return accountStringBuilder;
    }
}
