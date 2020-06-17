public class Receiver1 implements IReceiver{

  private int myNumber;

  public Receiver1() {
    myNumber = 10;
    System.out.println("Receiver1 initialized with " + myNumber);
    System.out.println("The objects of receiver1 cannot set beyond " + myNumber);
  }

  public int getMyNumber() {
    return myNumber;
  }

  public void setMyNumber(int myNumber) {
    this.myNumber = myNumber;
  }

  @Override
  public void performDo() {
    System.out.println("Received an addition request.");
    int presentNumber = getMyNumber();
    setMyNumber(presentNumber + 2);
    System.out.println(presentNumber + " + 2 = " + this.myNumber);
  }

  public void performUndo() {
    System.out.println("Received an undo addition request.");
    int presentNumber = this.myNumber;
    // we started with number 10. we'll not decrease further.
    if (presentNumber > 10) {
      setMyNumber(this.myNumber - 2);
      System.out.println(presentNumber + " - 2 = " + this.myNumber);
      System.out.println("\tUndo request processed");
    } else {
      System.out.println("Nothing more to undo...");
    }
  }

  public void performRedo() {
    System.out.println("Received an additional request.");
    int presentNumber = getMyNumber();
    setMyNumber(presentNumber + 2);
    System.out.println(presentNumber + " + 2 = " + this.myNumber);
  }

}
