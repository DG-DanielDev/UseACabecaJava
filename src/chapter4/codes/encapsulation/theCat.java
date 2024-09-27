package chapter4.codes.encapsulation;

public class theCat {
  private int height;
  private String name;

  int getHeight(){
    return height;
  }

  String getName(){
    return name;
  }

  public void setHeight(int ht) {
    if(ht > 9) {
      height = ht;
    }
  }

  public void setName(String nm) {
    if(nm != null) {
      name = nm;
    }
  }
}
