public class FundsCheck {

  private double cashInAccount = 1000.00;

  public double getCashInAccount() {
    return cashInAccount;
  }

  public void decreaseCashInAccount(double cashWithdrawn) {
    if (haveEnoughMoney(cashWithdrawn)) {
      cashInAccount -= cashWithdrawn;
      System.out.println("Withdraw complete: currente balance is " + getCashInAccount());
    } else {
      System.out.println("Error: You don't have enough money");
      System.out.println("Current Balance: " + getCashInAccount());
    }
  }

  public void increaseCashInAccount(double cashDeposited) {
    cashInAccount += cashDeposited;
  }

  public boolean haveEnoughMoney(double cashToWithdrawal) {
    return cashToWithdrawal < getCashInAccount();
  }

  public void makeDeposit(double cashToDeposit) {
    increaseCashInAccount(cashToDeposit);
    System.out.println("Deposit complete: currente balance is " + getCashInAccount());
  }
}
