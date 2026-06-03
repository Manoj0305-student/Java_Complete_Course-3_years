package OOPs;

class BankAccountStatement {

  private String accountHoldername;
  private double balance;

  BankAccountStatement(String name, double initialBalance) {

    if (name.isEmpty()) {
      System.out.println("Error: Name cannot be empty. Account not created.");
      this.accountHoldername = "Unknown";
      this.balance = 0;
      return;
    }

    if(initialBalance < 0) {
      System.out.println("Error: Amount cannot be negative. Account not created.");
      this.accountHoldername = "Unknown";
      this.balance = 0;
      return;
    }

    this.accountHoldername = name;
    this.balance = initialBalance;

  }

  public void deposit(double amount) {

    if (amount <= 0) {
      System.out.println("Error: Deposit amount must be postive.");
      return;
    }

    balance += amount;
    System.out.println("Successfully deposited: "+amount);
  }

  public void withdraw(double amount) {

    if (amount > balance) {
      System.out.println("Error: Withdrawal amount must be positive.");
      return;
    }

    if (amount < 0) {
      System.out.println("Error: Insufficient balance. Your balance is: "+balance);
      return;
    }

    balance -= amount;
    System.out.println("Successfully withdrawn: " + amount);

  }

  public double getBalance() {
    return balance;
  }

  public String getAccountHolderName() {
    return accountHoldername;
  }

}

public class EncapsulationProblem {

  public static void main(String[] args) {

    BankAccountStatement bank = new BankAccountStatement("Vishal", 3000.00);
    bank.deposit(200);
    bank.withdraw(500);

    System.out.println("\n--- Test 1: Valid Operations ---");
        bank.deposit(200);
        System.out.println("Balance: " + bank.getBalance());
        
        bank.withdraw(500);
        System.out.println("Balance: " + bank.getBalance());

        System.out.println("\n--- Test 2: Invalid Deposit ---");
        bank.deposit(-100);  //Should be rejected
        System.out.println("Balance: " + bank.getBalance());

        System.out.println("\n--- Test 3: Invalid Withdrawal (Negative) ---");
        bank.withdraw(-500);  //Should be rejected
        System.out.println("Balance: " + bank.getBalance());

        System.out.println("\n--- Test 4: Invalid Withdrawal (Insufficient Funds) ---");
        bank.withdraw(5000);  //Should be rejected
        System.out.println("Balance: " + bank.getBalance());

        System.out.println("\n--- Final Status ---");
        System.out.println("Account holder: " + bank.getAccountHolderName());
        System.out.println("Final balance: " + bank.getBalance());
    }
}

