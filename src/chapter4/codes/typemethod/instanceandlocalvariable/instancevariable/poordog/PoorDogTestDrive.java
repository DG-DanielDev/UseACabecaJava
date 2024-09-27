package chapter4.codes.typemethod.instanceandlocalvariable.instancevariable.poordog;

public class PoorDogTestDrive {
  public static void main(String[] args) {
    PoorDog one = new PoorDog();
    System.out.println("A idade do cão é " + one.getAge() + " anos");
    System.out.println("O tamanho do cão é " + one.getSize() + "cm");
    System.out.println("O nome do cão é " + one.getName());
    System.out.println("O cão é grande? " + one.getIsBig());
    System.out.println("Grade em caractere do cão " + one.getGradeDog());
  }
}