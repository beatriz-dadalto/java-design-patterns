public class NoCard implements IATMState{

  private ATMMAchine atmMachine;

  public NoCard(ATMMAchine newATMMachine) {
    atmMachine = newATMMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("Please enter your PIN");
    System.out.println("checking...");
    atmMachine.setIATMState(atmMachine.getHasCardState());
  }

  @Override
  public void ejectCard() {
    System.out.println("You didn't enter a card");
  }

  @Override
  public void insertPin(int pinEntered) {
    System.out.println("You have not entered your card");
  }

  @Override
  public void requestCash(int cashToWithdraw) {
    System.out.println("You have not entered your card");
  }

}
