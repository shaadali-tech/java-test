import java.util.Scanner;

public class lasttoady {
  int wheels;
  String color;
  int model;


  public lasttoady(int wheels, String color, int model) {
    this.wheels = wheels;
    this.color = color;
    this.model = model;
  }


  

  @Override
  public String toString() {
    return "lasttoady [wheels=" + wheels + ", color=" + color + ", model=" + model + "]";
  }




  public static void main(String[] args) {
    lasttoady swift=new lasttoady(4, "blue", 125);
    System.out.println(swift.color);
    System.out.println(swift.toString());
  }
  

}
