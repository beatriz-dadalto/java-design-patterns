/*
 * GOF definition says: "Factory Method
 * lets a class defer instantiation to subclasses."
 * In our case, the following method will create a Tiger or
 * Dog but at this point it does not know whether it will get
 * a Dog or a Tiger. This decision will be taken by the subclasses
 * DogFactory or TigerFactory. So, in this implementation, the
 * following method is playing the role of a factory (of creation)
 */

public abstract class AnimalFactory {

  public abstract Animal createAnimal();

}
