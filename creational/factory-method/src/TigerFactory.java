public class TigerFactory extends AnimalFactory{
  @Override
  public Animal createAnimal() {
    // creating a Tiger
    return new Tiger();
  }
}
