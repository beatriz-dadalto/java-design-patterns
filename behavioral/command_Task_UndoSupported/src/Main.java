public class Main {

  public static void main(String[] args) {

    System.out.println("*** COMMAND PATTERN WITH UNDO SUPPORTED OPERATIONS ***\n");

    // clients holds both the invoker and ICommand objects
    // testing receiver
    System.out.println("----Testing operations in Receiver1----");
    IReceiver intendedReceiver = new Receiver1();
    ICommand currentCommand = new AdditionCommand(intendedReceiver);

    Invoker invoker = new Invoker();
    invoker.setCommand(currentCommand);

    System.out.println("*Testing single do/undo operation");
    invoker.executeCommand();
    invoker.undoCommand();

    System.out.println("\n**Testing a series of do/undo operations");
    // executed the command 2 times
    invoker.executeCommand();
    invoker.executeCommand();
    // trying to undo 3 times
    invoker.undoCommand();
    invoker.undoCommand();
    invoker.undoCommand();

    System.out.println("\n---Testing operations in Receiver2---");
    IReceiver intendedReceiver2 = new Receiver2();
    ICommand currentCommand2 = new PowerCommand(intendedReceiver2);
    invoker.setCommand(currentCommand2);

    System.out.println("\n*Testing single do/undo operation");
    invoker.executeCommand();
    invoker.undoCommand();

    System.out.println("\n**Testing a series of do/undo operations");
    // executing the command 2 times
    invoker.executeCommand();
    invoker.executeCommand();
    // trying to undo 3 times
    invoker.undoCommand();
    invoker.undoCommand();
    invoker.undoCommand();
  }

}
