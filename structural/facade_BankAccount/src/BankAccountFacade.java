public class BankAccountFacade {

  private int accountNumber;
  private int securityCode;
  AccountNumberCheck accountNumberCheck;
  SecurityCodeCheck codeChecker;
  FundsCheck fundsChecker;
  WelcomeToBank bankWelcome;

  public BankAccountFacade(int newAccountNumber, int newSecurityCode) {
    accountNumber = newAccountNumber;
    securityCode = newSecurityCode;
    bankWelcome = new WelcomeToBank();
    accountNumberCheck = new AccountNumberCheck();
    codeChecker = new SecurityCodeCheck();
    fundsChecker = new FundsCheck();
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public int getSecurityCode() {
    return securityCode;
  }

  public void withdrawCash(double cashToGet) {
    if (verifyLogin()) {
      fundsChecker.decreaseCashInAccount(cashToGet);
      System.out.println("Withdraw Transaction Complete\n");
    } else {
      System.out.println("Withdraw Transaction Failed\n");
    }
  }

  public void depositCash(double cashToDeposit) {
    if (verifyLogin()) {
      fundsChecker.makeDeposit(cashToDeposit);
      System.out.println("Deposit Transaction Complete\n");
    } else {
      System.out.println("Deposit Transaction Failed\n");
    }
  }

  public boolean verifyLogin() {
    if (accountNumberCheck.accountActive(getAccountNumber())) {
      if (codeChecker.isCodeCorrect(getSecurityCode())) {
        return true;
      } else {
        System.out.println("Error: wrong code");
        return false;
      }
    } else {
      System.out.println("Error: wrong account number");
      return false;
    }
  }

}
