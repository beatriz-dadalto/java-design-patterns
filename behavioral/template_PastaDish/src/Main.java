public class Main {

  public static void main(String[] args) {
    System.out.println("** TEMPLATE METHOD **\n");

    PastaDish spaghetti = new SpaghettiMeatballs();
    PastaDish penne = new PenneAlfredo();

    System.out.println("====================");
    System.out.println("Preparing Spaghetti:");
    System.out.println("====================");
    spaghetti.makeRecipe();

    System.out.println("\n================");
    System.out.println("Preparing Penne:");
    System.out.println("================");
    penne.makeRecipe();

  }
}
