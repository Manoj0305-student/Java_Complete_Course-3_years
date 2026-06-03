package OOPs;

class BankAccountStatement {

  private String accountHoldername;
  private double balance;

  private String accountType;

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
    this.accountType = "Savings";
    System.out.println("Default saving account type: "+getAccountType());

  }

    BankAccountStatement(String name, double initialBalance, String accountType) {

      this(name, initialBalance);

      if(!accountType.equals("Savings") && !accountType.equals("Current") && !accountType.endsWith("Premium")) {
        System.out.println("Error: Invalid account type. Use Savings, Current, or Premium");
        return;
      }

      this.accountType = accountType;
      System.out.println("Account type updated to: " + accountType);
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

    if (amount < 0) {
      System.out.println("Error: Insufficient balance. Your balance is: "+balance);
      return;
    }

    if (amount > balance) {
      System.out.println("Error: Insufficient balance. Your balance is: " + balance);
      return;
    }

    if (accountType.equals("Savings") && amount > 5000) {
        System.out.println("Error: Exceeds Savings limit of $5,000 per withdrawal");
        return;
    }

    if (accountType.equals("Current") && amount > 10000) {
        System.out.println("Error: Exceeds Current limit of $10,000 per withdrawal");
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

  public String getAccountType() {
    return accountType;
  }

}

public class EncapsulationProblem {

  public static void main(String[] args) {

    BankAccountStatement bank = new BankAccountStatement("Vishal", 3000.00);
    bank.deposit(200);
    bank.withdraw(500);

   System.out.println("=== TEST 1: Two-parameter constructor ===");
        BankAccountStatement account1 = new BankAccountStatement("Alice", 10000);
        System.out.println("Type: " + account1.getAccountType());
        System.out.println();

        System.out.println("=== TEST 2: Three-parameter constructor (Savings) ===");
        BankAccountStatement account2 = new BankAccountStatement("Bob", 20000, "Savings");
        account2.withdraw(6000);
        System.out.println();

        System.out.println("=== TEST 3: Three-parameter constructor (Current) ===");
        BankAccountStatement account3 = new BankAccountStatement("Charlie", 30000, "Current");
        account3.withdraw(12000); 
        System.out.println();

        System.out.println("=== TEST 4: Three-parameter constructor (Premium) ===");
        BankAccountStatement account4 = new BankAccountStatement("David", 50000, "Premium");
        account4.withdraw(25000);
        System.out.println("Balance: " + account4.getBalance());
        System.out.println();

        System.out.println("=== TEST 5: Invalid account type ===");
        BankAccountStatement account5 = new BankAccountStatement("Eve", 5000, "VIP");
        System.out.println("Type: " + account5.getAccountType());
    }
}

