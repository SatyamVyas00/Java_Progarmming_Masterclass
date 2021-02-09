package academy.learnprograming;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name,double initialTransaction)
    {
        int position = customers.indexOf(findCustomer(name));
        if(position >= 0)
            return false;
        else
            return customers.add(new Customer(name,initialTransaction));
    }

    public boolean addCustomerTransaction(String name,double transaction)
       {
        int position = customers.indexOf(findCustomer(name));
        if(position >= 0)
        {
            customers.get(position).addTransaction(transaction);
            return true;
        }
        else
            return false;
       }

    public Customer findCustomer(String nameToFind)
    {
        for (int i=0;i<customers.size();i++)
        {
            if(customers.get(i).getName().equals(nameToFind))
                 return customers.get(i);
        }
        return null;
    }
}
