package academy.learnprograming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Satyam",123.45);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.34);

        System.out.println("Balance for Customer " +customer.getName()+ "is "+ customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i=0;i<intList.size();i++)
        {
            System.out.println(i+": "+intList.get(i));
        }

        intList.add(1,2);
        for (int i=0;i<intList.size();i++)
        {
            System.out.println(i+": "+intList.get(i));
        }
    }
}
