public class Receiver2 implements IReceiver{

  private boolean status;

  public Receiver2() {
    System.out.println("Receiver2 initialized");
    status = false;
  }

  @Override
  public void performDo() {
    System.out.println("Received a system power on request.");
    if (!status) {
      System.out.println("System is starting up.");
      status = true;
    } else {
      System.out.println("System is already running. So, power request is ignored.");
    }
  }

  @Override
  public void performUndo() {
    System.out.println("Received a undo request.");
    if (status) {
      System.out.println("System is currently powered on.");
      status = false;
      System.out.println("\tUndo request processed. System is switched off now.");
    } else {
      System.out.println("System is switched off at present.");
      status = true;
      System.out.println("\tUndo request processed. System is powered on now.");
    }
  }
}
