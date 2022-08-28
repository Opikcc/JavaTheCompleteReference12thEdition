package LambdaExpressions;

class IntegerFuncImpl {
  static int highestInt(int[] n) {
    int result = n[0];

    for (int i = 0; i < n.length; i++) {
      if (result < n[i])
        result = n[i];
    }

    return result;
  }
}

public class IntegerFuncDemo {
  
  static int intFuncs(IntegerFunc intFunc, int[] i) {
    return intFunc.func(i);
  }
  
  public static void main(String[] args) {    
    int[] listInt = { 3, 1, 4, 12, 90, 111231, 2, 4 };
    
    System.out.println("Highest Integer in listInt is " + intFuncs(IntegerFuncImpl::highestInt, listInt));
  }
}
