public class Main {

  public static void main(String[] args) {
    // here are instantiated all of the objects in the chain
    IChain chainCalc1 = new AddNumber();
    IChain chainCalc2 = new SubtractNumber();
    IChain chainCalc3 = new MultiplyNumber();
    IChain chainCalc4 = new DivideNumber();

    // here i tell each object where to forward the data if
    // it can't process the request
    chainCalc1.setNextChain(chainCalc2);
    chainCalc2.setNextChain(chainCalc3);
    chainCalc3.setNextChain(chainCalc4);

    // define the data in the Number object and
    // send it to the first object in the chain
    Number request = new Number(5,2,"div");
    System.out.print("div: ");
    chainCalc1.calculate(request);

    // pow is not supported
    Number request2 = new Number(5,2,"pow");
    System.out.print("pow: ");
    chainCalc1.calculate(request2);

    // chainCalc4.calculate(request); // error
  }

}
