
// This object will contain 2 numbers and a
// calculation to perform in the form of a String
public class Number {

  private int number1;
  private int number2;

  private String calculationWanted;

  public Number(int number1, int number2, String calculationWanted) {
    this.number1 = number1;
    this.number2 = number2;
    this.calculationWanted = calculationWanted;
  }

  public int getNumber1() {
    return number1;
  }

  public int getNumber2() {
    return number2;
  }

  public String getCalculationWanted() {
    return calculationWanted;
  }

}
