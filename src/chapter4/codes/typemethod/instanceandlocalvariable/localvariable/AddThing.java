package chapter4.codes.typemethod.instanceandlocalvariable.localvariable;

public class AddThing {
  int a;
  int b = 12;

  public int add() {
    int total = a + b; // variáveis locais precisam ser inicializadas antes de seu uso!
    return total;
  }
}
