public class RobotFacade {

  RobotColor rColor;
  RobotHands rHands;
  RobotBody rBody;

  public RobotFacade() {
    rColor = new RobotColor();
    rHands = new RobotHands();
    rBody = new RobotBody();
  }

  // constructing a Milano Robot
  public void constructMilanoRobot() {
    RobotBody.createRobot();
    System.out.println("Creation of a Milano Robot Start.");
    rColor.setDefaultColor();
    rHands.setMilanoHands();
    rBody.createRemainingParts();
    System.out.println(" Milano Robot creation end.");
    System.out.println();
  }

  // constructing a Milano Robot
  public void constructRobonautRobot() {
    RobotBody.createRobot();
    System.out.println("Initiating the creation process of a Robonaut Robot.");
    rColor.setDefaultColor();
    rHands.setRobonautHands();
    rBody.createRemainingParts();
    System.out.println(" A Robonaut Robot is created.");
    System.out.println();
  }

  // destroying a Milano Robot
  public void destroyMilanoRobot() {
    RobotBody.destroyRobot();
    System.out.println("Milano Robot's destruction process is stared.");
    rHands.resetMilanoHands();
    rBody.destroyHands();
    rBody.destroyRemainingParts();
    System.out.println(" Milano Robot's destruction process is over.");
    System.out.println();
  }

  // destroying a Robonaut Robot
  public void destroyRobonautRobot() {
    RobotBody.destroyRobot();
    System.out.println(" Initiating a Robonaut Robot's destruction process.");
    rHands.resetRobonautHands();
    rBody.destroyHands();
    rBody.destroyRemainingParts();
    System.out.println(" A Robonaut Robot is destroyed.");
    System.out.println();
  }

}
