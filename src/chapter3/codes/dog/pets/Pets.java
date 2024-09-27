package chapter3.codes.dog.pets;

import chapter3.codes.dog.Dog;

public class Pets {
  Dog[] pets;
  public void Pets() {
    pets = new Dog[7];

    pets[0] = new Dog();
    pets[1] = new Dog();
//    pets[2] = null;
    pets[3] = pets[1];
  }
}
