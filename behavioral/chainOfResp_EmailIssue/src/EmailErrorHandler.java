public class EmailErrorHandler implements IReceiver{

  private IReceiver nextReceiver;

  @Override
  public boolean handleMessage(Message message) {
    if (message.text.contains("Email")) {
      System.out.println(" EmailErrorHandler processed " + message.priority + " priority issue: " + message.text);
      return true;
    } else {
      if (nextReceiver != null) {
        nextReceiver.handleMessage(message);
      }
    }
    return false;
  }

  @Override
  public void nextErrorHandler(IReceiver nextReceiver) {
    this.nextReceiver = nextReceiver;
  }
}
