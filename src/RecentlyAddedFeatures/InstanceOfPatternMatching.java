package RecentlyAddedFeatures;

public class InstanceOfPatternMatching {
  public static void main(String[] args) {
    Number myOb = Integer.valueOf(9);
    
    // Use the pattern matching version of instanceof.
    if(myOb instanceof Integer iObj) {
      // iObj is known and in scope here.
      System.out.println("iObj refers to an integer: " + iObj);
    }
    
    if((myOb instanceof Integer iObj) && (iObj >= 0)) { // is OK
      // iObj is known and in scope here.
      System.out.println("iObj refers to an integer: " + iObj);
    }
    
    //  iObj does not exist here
    
    Object[] someObjs = {
      new String("Alpha"),
      new String("Beta"),
      new String("Omega"),
      Integer.valueOf(10)
    };
    
    int i;
    
    // This loop iterates until an element is not a String, or the end
    // of the array is reached.
    for(i = 0; (someObjs[i] instanceof String str) && (i < someObjs.length); i++) {
      System.out.println("Processing " + str);
    }
    
    i = 0;
    while((someObjs[i] instanceof String str) && (i < someObjs.length)) {
      System.out.println("Processing " + str);
      i++;
    }
  }
}
