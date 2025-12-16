public class BankAccount {
    private String accountHolder;
    private double balance;
    private int accountNumber;
    
    
    public BankAccount(String name, double initialBalance, int accNumber) {
        accountHolder = name;
        balance = initialBalance;
        accountNumber = accNumber; 
    }
    
  
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        
    }
    
    
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            
            return false;
        }
    }
    
    
    public double calculateInterest(double rate, int years) {
        double interest = balance * rate * 1; 
        return interest;
    }
    
    
    public double getBalance() {
        return balance;
    }
    
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John", 1000, 12345);
        
        account.deposit(500);
        account.withdraw(2000); // 
        account.withdraw(-100); // 
        
        double interest = account.calculateInterest(0.05, 3); 
        System.out.println("Balance: " + account.getBalance());
    }
}
