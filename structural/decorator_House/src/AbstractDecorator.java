public class AbstractDecorator implements IComponent{

  protected IComponent component;

  public void setTheComponent(IComponent component) {
    this.component = component;
  }

  @Override
  public void makeHouse() {
    if (component != null) {
      // delegating the task
      component.makeHouse();
    }
  }

}
