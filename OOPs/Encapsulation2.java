package OOPs;

class BankAccount {

  private double balance = 1000.0;

  public boolean withdraw(double amount) {

    if (amount <= 0) {
      System.out.println("Amount cannot be negative");
      return false;
    }

    if (amount > balance) {
      System.out.println("Insuffiecent Balance");
      return false;
    }

    balance -= amount;
    return true;
  }

  public void deposit(double amount) {
    if (amount <= 0) {
      System.out.println("Cannot deposit this amount. Please check the amount");
    }
    balance += amount;
  }

  public double getBalance() {
    return balance;
  }
}

public class Encapsulation2 {

  // Hiding data using private variables and controlling access through public methods.
 // It means using private variables with public getter/setter methods to control how data is accessed and modified.

  public static void main(String[] args) {

    BankAccount bank = new BankAccount();
    bank.deposit(500);
    bank.withdraw(200);
    double result = bank.getBalance();
    System.out.println("Remainig Balance: " + result);

  }

}
