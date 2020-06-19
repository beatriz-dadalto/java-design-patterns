public class MuteState implements IPossibleState{

  // user is pressing On button when TV is in Mute mode
  @Override
  public void pressOnButton(TV context) {
    System.out.println("You pressed On button.  Going from Mute mode to On state.");
    context.setCurrentState(new OnState());
    System.out.println(context.getCurrentState().toString());
  }

  // user is pressing Off button when the TV is in Mute mode
  @Override
  public void pressOffButton(TV context) {
    System.out.println("You pressed Off button.  Going from Mute mode to Off state.");
    context.setCurrentState(new OffState());
    System.out.println(context.getCurrentState().toString());
  }

  // Tv is in Mute mode already, user is pressing mute button again
  @Override
  public void pressMuteButton(TV context) {
    System.out.println("You pressed Mute button. Tv is already in Mute mode.");
  }

  @Override
  public String toString() {
    return "\t** TV is silent(mute) now **";
  }

}
