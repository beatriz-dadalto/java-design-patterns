public class AdditionCommand implements ICommand{

  private IReceiver receiver;

  public AdditionCommand(IReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void executeCommand() {
    receiver.performDo();
  }

  @Override
  public void executeUndoCommand() {
    receiver.performUndo();
  }
}
