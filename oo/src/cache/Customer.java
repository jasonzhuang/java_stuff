package cache;

import java.util.HashMap;

public class Customer {
    private static HashMap<String, Customer> cache = new HashMap<String, Customer>();

    private String name;

    public Customer(){
        
    }

    public Customer(String name) {
        this.name = name;
    }

    public static Customer getNamed(String name) {
        if (cache.containsKey(name)) {
            //this is fine, not need cast type
            return cache.get(name);
        }
        Customer customer = new Customer(name);
        cache.put(name, customer);
        return customer;
    }
}
