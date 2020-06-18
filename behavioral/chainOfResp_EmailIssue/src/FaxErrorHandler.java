public class FaxErrorHandler implements IReceiver{

  private IReceiver nextReceiver;

  @Override
  public boolean handleMessage(Message message) {
    if (message.text.contains("Fax")) {
      System.out.println(" FaxErrorHandler processed " + message.priority + " priority issue: " + message.text);
      return true;
    } else if (nextReceiver != null){
      nextReceiver.handleMessage(message);
    }
    return false;
  }

  @Override
  public void nextErrorHandler(IReceiver nextReceiver) {
    this.nextReceiver = nextReceiver;
  }
}
