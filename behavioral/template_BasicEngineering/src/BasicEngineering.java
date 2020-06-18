public abstract class BasicEngineering {

  // making the method final to prevent overriding
  public final void completeCourse() {
    // the course needs to ne completed in the following sequence
    // 1.Math 2.SoftSkills 3.SpecialPaper 4.AdditionalPapers (if any)
    
    // common papers:
    completeMath();
    completeSoftSkills();
    // specialization paper
    completeSpecialPaper();

    if (isAdditionalPapersNeeded()) {
      completeAdditionalPapers();
    }
  }

  private void completeMath() {
    System.out.println("1.Mathematics");
  }

  private void completeSoftSkills() {
    System.out.println("2.SoftSkills");
  }

  public abstract void completeSpecialPaper();

  private void completeAdditionalPapers() {
    System.out.println("4.Additional Papers are need for this course.");
  }

  // by default, AdditionalPapers are needed for a course.
  boolean isAdditionalPapersNeeded() {
    return true;
  }

}
