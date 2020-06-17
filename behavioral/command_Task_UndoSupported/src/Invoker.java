public class Invoker {

  private ICommand commandToBePerformed;

  // alternative approach:
  // you can also initialize the invoker with a command object
//  public Invoker(ICommand commandToBePerformed) {
//    this.commandToBePerformed = commandToBePerformed;
//  }

  public void setCommand(ICommand commandToBePerformed) {
    this.commandToBePerformed = commandToBePerformed;
  }

  public void executeCommand() {
    commandToBePerformed.executeCommand();
  }

  public void undoCommand() {
    commandToBePerformed.executeUndoCommand();
  }

}
