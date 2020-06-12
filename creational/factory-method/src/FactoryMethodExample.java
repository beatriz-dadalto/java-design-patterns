public class FactoryMethodExample {

  public static void main(String[] args) {

    System.out.println("*** Factory Method Pattern ***\n");

    // creating a Tiger Factory
    AnimalFactory tigerFactory = new TigerFactory();
    // creating a tiger using the Factory Method
    Animal aTiger = tigerFactory.createAnimal();
    aTiger.speak();
    aTiger.preferredAction();

    // creating a Dog Factory
    AnimalFactory dogFactory = new DogFactory();
    // creating a dog using the Factory Method
    Animal aDog = dogFactory.createAnimal();
    aDog.speak();
    aDog.preferredAction();

  }

}
