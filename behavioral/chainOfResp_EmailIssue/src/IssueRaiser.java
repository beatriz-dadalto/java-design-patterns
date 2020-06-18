public class IssueRaiser {

  public IReceiver setFirstReceiver;

  public void setFirstErrorHandler(IReceiver firstErrorHandler) {
    this.setFirstReceiver = firstErrorHandler;
  }

  public void raiseMessage(Message message) {
    if (setFirstReceiver != null) {
      setFirstReceiver.handleMessage(message);
    }
  }

}
