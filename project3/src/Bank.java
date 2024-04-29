import java.util.HashMap;

public class Bank {
    private HashMap<String, Customer> customerHashMap = new HashMap<>();


    public void addCustomer(String pin, Customer customer){
        customerHashMap.put(pin, customer);
    }

    public void removeCustomer(String pin){
        customerHashMap.remove(pin);
    }

    public Customer getCustomer(String pin){
        Customer foundCustomer = null;
        if(customerHashMap.containsKey(pin)){
            foundCustomer = customerHashMap.get(pin);
        }
        return foundCustomer;
    }
    public StringBuilder getAllCustomers(){
        StringBuilder customerStringBuilder = new StringBuilder();
        customerHashMap.forEach((pin, customer) -> {
            customerStringBuilder.append(customer.toString());
        });
        return customerStringBuilder;
    }
}
