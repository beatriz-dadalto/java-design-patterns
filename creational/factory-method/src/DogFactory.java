public class DogFactory extends AnimalFactory {
  @Override
  public Animal createAnimal() {
    // creating a Dog
    return new Dog();
  }
}
