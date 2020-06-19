public class OnState implements IPossibleState{

  // TV is On already, user is pressing On button again
  @Override
  public void pressOnButton(TV context) {
    System.out.println("You pressed On button. TV is already in On state.");
  }

  // user is pressing Off button when the TV is in On state
  @Override
  public void pressOffButton(TV context) {
    System.out.println("You pressed Off button.  Going from On to Off state.");
    context.setCurrentState(new OffState());
    System.out.println(context.getCurrentState().toString());
  }

  // user is pressing Mute button when the TV is in On state
  @Override
  public void pressMuteButton(TV context) {
    System.out.println("You pressed Mute button. Going from On to Mute mode.");
    context.setCurrentState(new MuteState());
    System.out.println(context.getCurrentState().toString());
  }

  @Override
  public String toString() {
    return "\t** TV is switched On now.**";
  }

}
