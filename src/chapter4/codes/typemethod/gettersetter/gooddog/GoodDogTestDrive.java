package chapter4.codes.typemethod.gettersetter.gooddog;

public class GoodDogTestDrive {
  public static void main(String[] args) {
    System.out.println();

    GoodDog one = new GoodDog();
    one.setSize(70);

    GoodDog two = new GoodDog();
    two.setSize(8);

    System.out.println("Dog one: " + one.getSize() + "kg");
    one.bark();

    System.out.println("\nDog two: " + two.getSize() + "kg");
    two.bark();
  }
}
