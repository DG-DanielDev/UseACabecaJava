package chapter3.codes.dog;

public class Dog {
  String name;

  public static void main(String[] args) {
    System.out.println("\n======Teste de Classe Nº1 sem Arrays======\n");
    Dog fido = new Dog();
    fido.name = "Fido";

    fido.eat();
    fido.bark();
    fido.chaseCat();

    // AND

    System.out.println("\n======Teste de Classe Nº2 com Arrays======");
    Dog[] myDogs = new Dog[5];

    System.out.println("=====myDogs[0]=====\n");
    myDogs[0] = new Dog();
    myDogs[0].name = "Fido";
    System.out.println("The first dog is " + myDogs[0].name);
    myDogs[0].bark();
    myDogs[0].eat();

    System.out.println("\n======myDogs[1]=====");
    myDogs[1] = new Dog();
    myDogs[1].name = "Max";
    System.out.println("The second dog's name is: " + myDogs[1].name);
    myDogs[1].bark();
    myDogs[1].eat();
    myDogs[1].chaseCat();

    System.out.println("\n======myDogs[2]=====");
    myDogs[2] = new Dog();
    myDogs[2].name = "Bart";
    System.out.println("The third dog's name is: " + myDogs[2].name);
    myDogs[2].bark();
    myDogs[2].eat();

    System.out.println("\n======myDogs[3]=====");
    myDogs[3] = fido;
    System.out.println("The forth dog's name is: " + myDogs[3].name);
    myDogs[3].bark();
    myDogs[3].eat();

    System.out.println("\n==: :All in one: :==");
    int x = 0;
    while(x < myDogs.length-1) {
      myDogs[x].bark();
      ++x;
    }
  }

  void bark() {
    System.out.println(name + ": Ruff, Ruff!");
  }
  void eat() {
    System.out.println(name + " is eating...");
  }
  void chaseCat() {
    System.out.println(name + " is chasing cats...");
  }
}
