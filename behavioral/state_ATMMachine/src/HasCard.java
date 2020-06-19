public class HasCard implements IATMState{

  private ATMMAchine atmMachine;

  public HasCard(ATMMAchine newATMMachine) {
    atmMachine = newATMMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("You can only insert one card at a time");
  }

  @Override
  public void ejectCard() {
    System.out.println("Your card is ejected");
    atmMachine.setIATMState(atmMachine.getNoCardState());
  }

  @Override
  public void insertPin(int pinEntered) {
    if (pinEntered == 1234) {
      System.out.println("You entered the correct PIN");
      atmMachine.setCorrectPinEntered(true);
      atmMachine.setIATMState(atmMachine.getHasPin());
    } else {
      System.out.println("You entered the wrong PIN");
      atmMachine.setCorrectPinEntered(false);
      System.out.println("Your card is ejected");
      atmMachine.setIATMState(atmMachine.getNoCardState());
    }
  }

  @Override
  public void requestCash(int cashToWithdraw) {
    System.out.println("You have not entered your PIN");
  }

}
