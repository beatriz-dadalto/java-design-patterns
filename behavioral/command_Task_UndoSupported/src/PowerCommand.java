public class PowerCommand implements ICommand{

  private IReceiver receiver;

  public PowerCommand(IReceiver receiver) {
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
