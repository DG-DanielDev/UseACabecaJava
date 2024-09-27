package chapter4.codes.typemethod.gettersetter.gooddog;

public class GoodDog {
  private int size;

  public int getSize() {
    return size;
  }
  public int setSize(int s) {
    size = s;
    return size;
  }
  void bark() {
    if(size > 60) {
      System.out.println("Woof! Woof!");
    } else if(size > 14) {
      System.out.println("Ruff! Ruff!");
    } else {
      System.out.println("Yip! Yip!");
    }
  }
}
