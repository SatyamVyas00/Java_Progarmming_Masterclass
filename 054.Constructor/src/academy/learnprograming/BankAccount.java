package academy.learnprograming;

public class BankAccount {
    private int accountNo;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNo;

    public BankAccount()
    {
        this(000,100.50,"Default Name","Default Email","Default PhoneNo");
        System.out.println("Empty Constructor is Being Called");
    }

    public BankAccount(String customerName, String email, String phoneNo) {
        this(000,123.45,customerName,email,phoneNo);
    }

    public BankAccount(int accountNo, double balance, String customerName, String email, String phoneNo)
    {
        System.out.println("Constructor is Called to Set Values");
        this.accountNo=accountNo;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNo=phoneNo;
    }


    public void setAccountNo(int accountNo)
    {
        this.accountNo=accountNo;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo=phoneNo;
    }
    public int getAccountNo()
    {
        return accountNo;
    }
    public double getBalance()
    {
        return balance;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPhoneNo()
    {
        return phoneNo;
    }

    public void deposit(double toDeposit)
    {
        balance+=toDeposit;
        System.out.println("Deposit of "+toDeposit+" Successful");
        System.out.println("Balance: "+balance);
    }
    public void withdraw(double toWithdraw)
    {
        if(balance<toWithdraw)
        {
            System.out.println("Insufficient Balance  for Withdrawal");
            System.out.println("Balance: "+balance+"    withdrawal: "+toWithdraw);
        }
        else {
            balance -= toWithdraw;
            System.out.println("Withdraw of "+toWithdraw+" Successful");
            System.out.println("Balance: "+balance);
        }
    }
}