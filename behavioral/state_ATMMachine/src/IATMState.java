public interface IATMState {
  // different states expected
  // HasCard, NoCard, HasPin, NoCash
  void insertCard();
  void ejectCard();
  void insertPin(int pinEntered);
  void requestCash(int cashToWithdraw);
}
