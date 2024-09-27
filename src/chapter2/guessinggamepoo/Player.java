package chapter2.guessinggamepoo;

public class Player {
  int number = 0;

  public void guess(){
    // Math.random() retorna valor double de 0.0 até 1.0.
    // (int) permite que o valor double seja convertido para integer.
    // A multiplicação de 10 permite um valor de 0 a 9.
    number = (int) (Math.random() * 10);
    System.out.println("Estou pensando no número " + number);
  }
}
