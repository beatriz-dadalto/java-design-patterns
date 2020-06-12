public class BankAccount {
  public static void main(String[] args) {
    BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

    accessingBank.withdrawCash(50.00);
    accessingBank.withdrawCash(900.00);
    accessingBank.depositCash(200.00);

    System.out.println("*** ACCESSING WITH WRONG CODE ***");

    BankAccountFacade accessingBank2 = new BankAccountFacade(12345678, 1256);
    accessingBank2.withdrawCash(50.00);
    accessingBank2.depositCash(200.00);

    System.out.println("\n*** ACCESSING WITH WRONG ACCOUNT NUMBER ***");

    BankAccountFacade accessingBank3 = new BankAccountFacade(12345699, 1234);
    accessingBank3.withdrawCash(50.00);
    accessingBank3.depositCash(200.00);
  }

}
