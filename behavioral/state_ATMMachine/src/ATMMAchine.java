public class ATMMAchine {

  private IATMState hasCard;
  private IATMState noCard;
  private IATMState hasCorrectPin;
  private IATMState atmOutOfMoney;

  private IATMState atmState;

  private int cashInMachine = 2000;
  private boolean correctPinEntered = false;

  public ATMMAchine() {
    hasCard = new HasCard(this);
    noCard = new NoCard(this);
    hasCorrectPin = new HasPin(this);
    atmOutOfMoney = new NoCash(this);

    atmState = noCard;

    if (cashInMachine <= 0) {
      atmState = atmOutOfMoney;
    }
  }

  public void setIATMState(IATMState newATMState) {
    atmState = newATMState;
  }

  public void setCashInMachine(int newCashInMachine) {
    cashInMachine = newCashInMachine;
  }

  public void insertCard() {
    atmState.insertCard();
  }

  public void ejectCard() {
    atmState.ejectCard();
  }

  public void requestCash(int cashToWithdraw) {
    atmState.requestCash(cashToWithdraw);
  }

  public void insertPin(int pinEntered) {
    atmState.insertPin(pinEntered);
  }

  public void setCorrectPinEntered(boolean correctPinEntered) {
    this.correctPinEntered = correctPinEntered;
  }

  public int getCashInMachine() {
    return cashInMachine;
  }

  public IATMState getHasCardState() { return hasCard; }
  public IATMState getNoCardState() { return noCard; }
  public IATMState getHasPin() { return hasCorrectPin; }
  public IATMState getNoCashState() { return atmOutOfMoney; }

}
