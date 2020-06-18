public class DivideNumber implements IChain{

  private IChain nextInChain;

  // defines the next object to receive the
  // data if this one can't use it
  @Override
  public void setNextChain(IChain nextChain) {
    nextInChain = nextChain;
  }

  // tries to calculate the data, or passes it
  // to the object defined in method setNextChain()
  @Override
  public void calculate(Number request) {
    if (request.getCalculationWanted().equalsIgnoreCase("div")) {
      System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1() / request.getNumber2()));
    } else {
      System.out.println("Only works for add, sun, mult and div!");
    }
  }
}
