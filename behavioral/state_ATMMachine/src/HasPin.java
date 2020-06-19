public class HasPin implements IATMState{

  private ATMMAchine atmMachine;

  public HasPin(ATMMAchine newATMMachine) {
    atmMachine = newATMMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("You already entered a card");
  }

  @Override
  public void ejectCard() {
    System.out.println("You card is ejected");
    atmMachine.setIATMState(atmMachine.getNoCardState());
  }

  @Override
  public void insertPin(int pinEntered) {
    System.out.println("You already entered a PIN");
  }

  @Override
  public void requestCash(int cashToWithdraw) {
    if (cashToWithdraw > atmMachine.getCashInMachine()) {
      System.out.println("The machine doesn't have that much cash available");
      System.out.println("Your card is ejected");
      atmMachine.setIATMState(atmMachine.getNoCardState());
    } else {
      System.out.println(cashToWithdraw + " is provided by the machine");
      atmMachine.setCashInMachine(atmMachine.getCashInMachine() - cashToWithdraw);
      System.out.println("Your card is ejected");
      atmMachine.setIATMState(atmMachine.getNoCardState());

      if (atmMachine.getCashInMachine() <= 0) {
        atmMachine.setIATMState(atmMachine.getNoCashState());
      }
    }

  }

}
