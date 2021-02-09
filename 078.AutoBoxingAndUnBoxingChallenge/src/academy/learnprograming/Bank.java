package academy.learnprograming;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String nameOfTheBranch)
    {
        int position = branches.indexOf(findBranch(nameOfTheBranch));
        if(position >= 0)
            return false;
        else
        {
            branches.add(new Branch(nameOfTheBranch));
            return true;
        }
    }

    public boolean addCustomer(String nameOfTheBranch,String nameOfTheCustomer,double initialTransaction)
    {
        int position = branches.indexOf(findBranch(nameOfTheBranch));
        if(position < 0)
        {
            addBranch(nameOfTheBranch);
            position = branches.indexOf(findBranch(nameOfTheBranch));
        }
        return branches.get(position).newCustomer(nameOfTheCustomer,initialTransaction);
    }

    public boolean addCustomerTransaction(String nameOfTheBranch,String nameOfTheCustomer,double transaction)
    {
        int position = branches.indexOf(findBranch(nameOfTheBranch));
        return branches.get(position).addCustomerTransaction(nameOfTheCustomer,transaction);
    }

    private Branch findBranch(String branchToFind)
    {
    for (int i=0;i<branches.size();i++)
    {
        if(branches.get(i).getName().equals(branchToFind))
            return branches.get(i);
    }
    return null;
    }

    public boolean listCustomers(String nameOfTheBranch,boolean printTransaction)
    {
        int position = branches.indexOf(findBranch(nameOfTheBranch));
        if(position >=0)
        {
            System.out.println("Customer details for branch "+nameOfTheBranch);
            for (int i=0;i<branches.get(position).getCustomers().size();i++)
            {
                ArrayList<Customer> customers = branches.get(position).getCustomers();
                System.out.println("Customer: "+customers.get(i).getName()+"["+(i+1)+"]");
                if (printTransaction)
                {
                    System.out.println("Transactions");
                    ArrayList<Double> transaction = customers.get(i).getTransactions();
                    for (int j=0;j<transaction.size();j++)
                    {
                        System.out.println("["+(j+1)+"]  Amount "+transaction.get(j));
                    }
                }
            }
            return true;
        }
        else
            return false;
    }
}
