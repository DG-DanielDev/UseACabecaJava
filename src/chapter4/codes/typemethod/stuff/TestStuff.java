package chapter4.codes.typemethod.stuff;

public class TestStuff {
  void go() {
    System.out.println("\nint numbers:");
    TestStuff t = new TestStuff();
    t.takeTwo(12, 34);

    System.out.println("\nint variables:");
    int foo = 7;
    int bar = 3;
    t.takeTwo(foo, bar);
  }
  void takeTwo(int x, int y) {
    int z = x + y;
    System.out.println("Total is " + z);
  }
}
