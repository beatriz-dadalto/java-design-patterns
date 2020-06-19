public class TV {

  private IPossibleState currentState;

  public TV() {
    // initially TV is initialized with off state
    this.setCurrentState(new OffState());
  }

  public IPossibleState getCurrentState() {
    return currentState;
  }

  public void setCurrentState(IPossibleState currentState) {
    this.currentState = currentState;
  }

  public void pressOffButton() {
    // delegating the state
    currentState.pressOnButton(this);
  }

  public void pressOnButton() {
    // delegating the state
    currentState.pressOnButton(this);
  }
  public void pressMuteButton() {
    // delegating the state
    currentState.pressMuteButton(this);
  }

}
