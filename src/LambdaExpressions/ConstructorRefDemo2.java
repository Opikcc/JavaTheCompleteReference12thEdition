package LambdaExpressions;

// Demonstrate a constructor reference with a generic class.
class ConstructorRefDemo2 {

  public static void main(String[] args) {
    // Create a reference to the MyClass<T> constructor.
    MyFunc5<Integer> myClassCons = MyClass2<Integer>::new;

    // Create an instance of MyClass<T> via that constructor reference.
    MyClass2<Integer> mc = myClassCons.func(100);

    // Use the instance of MyClass<T> just created.
    System.out.println("val in mc is " + mc.getVal());
  }
}
