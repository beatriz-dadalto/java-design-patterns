
public class CoffeeTouchscreenAdapter implements ICoffeeMachine{

  private OldCoffeeMachine oldCoffeeMachine;

  public CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
    this.oldCoffeeMachine = oldCoffeeMachine;
  }

  @Override
  public void selectFlavorA() {
    oldCoffeeMachine.optionOne();
  }

  @Override
  public void selectFlavorB() {
    oldCoffeeMachine.optionTwo();
  }

}
