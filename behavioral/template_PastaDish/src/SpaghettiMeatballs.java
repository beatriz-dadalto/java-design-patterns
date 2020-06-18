public class SpaghettiMeatballs extends PastaDish{
  @Override
  public void addPasta() {
    System.out.println("Add spaghetti");
  }

  @Override
  protected void addSauce() {
    System.out.println("Add tomato sauce");
  }

  @Override
  protected void addProtein() {
    System.out.println("Add meatballs");
  }

  @Override
  protected void addGarnish() {
    System.out.println("Add Parmesan cheese");
  }
}
