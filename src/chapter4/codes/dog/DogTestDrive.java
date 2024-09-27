package chapter4.codes.dog;

public class DogTestDrive {
  public static void main(String[] args) {
    Dog one = new Dog();
    one.size = 70;
    one.name = "Ptolomeu";

    Dog two = new Dog();
    two.size = 8;
    two.name = "Killer";

    Dog three = new Dog();
    three.size = 35;
    three.name = "Fido";

    one.bark();
    two.bark();
    three.bark();

    System.out.println("\n==============\n");

    Dog d = new Dog();
    d.size = 23;
    d.name = "Luna";
    d.bark2(10);
  }
}
