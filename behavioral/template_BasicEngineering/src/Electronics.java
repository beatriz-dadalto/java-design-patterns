public class Electronics extends BasicEngineering {
  @Override
  public void completeSpecialPaper() {
    System.out.println("3.Digital Logic and Circuit Theory.");
  }

  // overriding the hook method
  // indicating that additionalPapers are NOT NEEDED for Electronics

  @Override
  boolean isAdditionalPapersNeeded() {
    return false;
  }
}
