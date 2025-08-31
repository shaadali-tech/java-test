package inkgcding;

import newpackage.mains;

public class gettertest {
  public static void main(String[] args) {
     mains car=new mains("green","maruti", 8, 8000);
     car.setcolor("blue");
     System.out.println(car.getcolor());
     System.out.println(car.getmodel());
  }

}
