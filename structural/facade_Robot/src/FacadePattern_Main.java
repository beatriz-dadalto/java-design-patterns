
// client code

public class FacadePattern_Main {
  public static void main(String[] args) {
    System.out.println("*** FACADE PATTERN ***");
    
    // creating robots
    RobotFacade milanoRobotFacade = new RobotFacade();
    milanoRobotFacade.constructMilanoRobot();

    RobotFacade robonautRobotFacade = new RobotFacade();
    robonautRobotFacade.constructRobonautRobot();

    // destroying robots
    milanoRobotFacade.destroyMilanoRobot();
    robonautRobotFacade.destroyRobonautRobot();
  }
}
