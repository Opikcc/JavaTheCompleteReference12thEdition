package RecentlyAddedFeatures;

public sealed class Alpha extends MySealedClass implements MySealedIF permits Gamma {
  @Override
  public void myMeth() {
    System.out.println("In Alpha's myMeth");
  }
}
