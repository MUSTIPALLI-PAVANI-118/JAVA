package account;

public class Account {
    String name;
    public double balance;  // ✅ FIXED

    public void createAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}