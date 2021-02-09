package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        //CHALLENGE 1
        System.out.println("********************************");
        System.out.println("CHALLENGE 1");

        BankAccount account1 = new BankAccount(001,10000,"Satyam Vyas","Satyamvyas@email.com","1234566789");
//        account1.setAccountNo(001);
//        account1.setBalance(10000);
//        account1.setCustomerName("Satyam Vyas");
//        account1.setEmail("Satyamvyas@email.com");
//        account1.setPhoneNo("123456789");

        System.out.println("Account No: "+account1.getAccountNo());
        System.out.println("Balance: "+account1.getBalance());
        System.out.println("Customer Name: "+account1.getCustomerName());
        System.out.println("Email: "+account1.getEmail());
        System.out.println("PhoneNo: "+account1.getPhoneNo());

        account1.deposit(5000);
        //System.out.println("Balance: "+account1.getBalance());
        account1.withdraw(25000);
        //System.out.println("Balance: "+account1.getBalance());
        account1.withdraw(2500);
        //System.out.println("Balance: "+account1.getBalance());

        BankAccount account2 = new BankAccount("Satyam","Satyam@email.com","1234567890");
        System.out.println(account2.getAccountNo()+" name "+account2.getCustomerName());

    //CHALLENGE 2
System.out.println("********************************");
System.out.println("CHALLENGE 2");
System.out.println("********************************");
    System.out.println("ACCOUNT 1:");
        VipCustomer vipAccount1 = new VipCustomer();
        System.out.println("VIP Account Name: "+vipAccount1.getName());
        System.out.println("VIP Account Credit Limit: "+vipAccount1.getCreditLimit());
        System.out.println("VIP Account Email: "+vipAccount1.getEmail());

    System.out.println("ACCOUNT 2:");
        VipCustomer vipAccount2 = new VipCustomer("Satyam",25000);
        System.out.println("VIP Account Name: "+vipAccount2.getName());
        System.out.println("VIP Account Credit Limit: "+vipAccount2.getCreditLimit());
        System.out.println("VIP Account Email: "+vipAccount2.getEmail());

    System.out.println("ACCOUNT 3:");
        VipCustomer vipAccount3 = new VipCustomer("SatyamVyas",100,"Satyam@email.com");
        System.out.println("VIP Account Name: "+vipAccount3.getName());
        System.out.println("VIP Account Credit Limit: "+vipAccount3.getCreditLimit());
        System.out.println("VIP Account Email: "+vipAccount3.getEmail());

    }
}
