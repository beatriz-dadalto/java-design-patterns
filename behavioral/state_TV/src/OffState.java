public class OffState implements IPossibleState{

  // user is pressing off button when the TV is in off state
  @Override
  public void pressOnButton(TV context) {
    System.out.println("You pressed On button. Going from off to On state.");
    context.setCurrentState(new OnState());
    System.out.println(context.getCurrentState().toString());
  }

  // TV is off already, user is pressing off button again
  @Override
  public void pressOffButton(TV context) {
    System.out.println("You pressed Off button. TV is already in off state.");
  }

  // user is pressing Mute button when the TV is in off state
  @Override
  public void pressMuteButton(TV context) {
    System.out.println("You pressed Mute button. TV is already in off state, so Mute operation will not work.");
  }

  @Override
  public String toString() {
    return "\t** TV is switched off now.**";
  }

}
